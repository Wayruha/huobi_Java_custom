package com.huobi.utils;


import okhttp3.Response;

/**
 * The interface for define asynchronous invoking callback.<br> If you want to ues the asynchronous
 * invoking, you must implement the ResponseCallback yourself. <br> The onResponse method is
 * mandatory, when the asynchronous invoking completed, this method will be called.<br> You should
 * check the AsyncResult to know whether the asynchronous invoking is successful or not, and get the
 * response data from AsyncResult.
 */
@FunctionalInterface
public interface ResponseCallback<T> {

  /**
   * Be called when the request successful.
   *
   */
  void onResponse(T response);

  default void onClosed(int code, String reason){

  }

  default void onFailure(Throwable ex, Response response){

  }

  default void onOpen(Response response){

  }
}
