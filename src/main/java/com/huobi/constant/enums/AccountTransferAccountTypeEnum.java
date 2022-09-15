package com.huobi.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum  AccountTransferAccountTypeEnum {
  SPOT("spot"),
  MARGIN("margin");
  private String accountType;

  public static AccountTransferAccountTypeEnum fromName(String name){
    return Arrays.stream(values())
            .filter(wallet -> wallet.getAccountType().equalsIgnoreCase(name))
            .findFirst().orElseThrow(() -> new IllegalArgumentException("Unknown wallet type: " + name));
  }
}
