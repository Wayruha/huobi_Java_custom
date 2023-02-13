package com.huobi.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * buy, sell, both.
 */
@Getter
@AllArgsConstructor
public enum OrderSideEnum {
  BUY("buy"),
  SELL("sell");

  private final String code;

  public static OrderSideEnum find(String code) {
    for (OrderSideEnum sideEnum : OrderSideEnum.values()) {
      if (sideEnum.getCode().equals(code)) {
        return sideEnum;
      }
    }
    throw new IllegalArgumentException("Not a valid order side: " + code);
  }
}