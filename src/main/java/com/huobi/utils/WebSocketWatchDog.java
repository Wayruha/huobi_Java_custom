package com.huobi.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huobi.constant.enums.ConnectionStateEnum;


public class WebSocketWatchDog {

  public static long RECEIVE_LIMIT_TS = 60_000;
  public static int DELAY_ON_FAILURE = 15;
  public static int HEALTH_CHECK_RATE_MS = 1_000;

  private static final Map<Long,WebSocketConnection> TIME_HELPER = new ConcurrentHashMap<>();
  private static final Logger log = LoggerFactory.getLogger(WebSocketWatchDog.class);


  static {
    ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
    exec.scheduleAtFixedRate(() -> {
      TIME_HELPER.entrySet().forEach(entry -> {
        WebSocketConnection connection = entry.getValue();
        if (connection.getState() == ConnectionStateEnum.CONNECTED) {
          // Check response

          long ts = System.currentTimeMillis() - connection.getLastReceivedTime();
          if (ts > RECEIVE_LIMIT_TS) {
            log.warn("[Sub][" + connection.getConnectionId() + "] No response from server");
            connection.reConnect(DELAY_ON_FAILURE);
          }

        } else if (connection.getState() == ConnectionStateEnum.DELAY_CONNECT) {
          connection.reConnect();
        } else if (connection.getState() == ConnectionStateEnum.CLOSED_ON_ERROR) {
          connection.reConnect(DELAY_ON_FAILURE);
        }
      });
    }, HEALTH_CHECK_RATE_MS, HEALTH_CHECK_RATE_MS, TimeUnit.MILLISECONDS);
    Runtime.getRuntime().addShutdownHook(new Thread(exec::shutdown));
  }

  private WebSocketWatchDog() {}


  public static void onConnectionCreated(WebSocketConnection connection) {
    TIME_HELPER.put(connection.getConnectionId(), connection);
  }

  public static void onClosedNormally(WebSocketConnection connection) {
    TIME_HELPER.remove(connection);
  }
}
