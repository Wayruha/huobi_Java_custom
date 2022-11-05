package com.huobi.constant.enums;

import lombok.Getter;

/**
 * The balance mode used for subscribing the balance notification.
 */
@Getter
public enum AccountUpdateModeEnum {

    /**
     * Subscribe TOTAL balance, total balance is the sum of available and frozen
     */
    ACCOUNT_CHANGE("0"),

    /**
     * Subscribe available balance
     */
    AVAILABLE_CHANGE("1"),

    /**
     * Whenever account balance or available balance changed, it will be updated together
     */
    BOTH("2");

    private final String code;

    AccountUpdateModeEnum(String code) {
        this.code = code;
    }

}
