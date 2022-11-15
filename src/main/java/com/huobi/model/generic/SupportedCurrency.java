package com.huobi.model.generic;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SupportedCurrency {
    @JSONField(name = "tags")
    private String tags;
    @JSONField(name = "cawt")
    private Boolean currencyAddrWithTag;
    @JSONField(name = "fc")
    private BigDecimal fastConfirms;
    @JSONField(name = "sc")
    private BigDecimal safeConfirms;
    @JSONField(name = "dma")
    private BigDecimal depositMinAmount;
    @JSONField(name = "wma")
    private BigDecimal withdrawMinAmount;
    @JSONField(name = "ft")
    private String feeType;
    @JSONField(name = "whe")
    private Boolean whiteEnabled;
    @JSONField(name = "cd")
    private Boolean countryDisabled;
    @JSONField(name = "qc")
    private Boolean quoteCurrency;
    @JSONField(name = "sp")
    private BigDecimal showPrecision;
    @JSONField(name = "wp")
    private BigDecimal withdrawPrecision;
    @JSONField(name = "fn")
    private String fullName;
    @JSONField(name = "at")
    private BigDecimal assetType;
    @JSONField(name = "cc")
    private String currencyCode;
    @JSONField(name = "v")
    private Boolean visible;
    @JSONField(name = "de")
    private Boolean depositEnabled;
    @JSONField(name = "wed")
    private Boolean withdrawEnabled;
    @JSONField(name = "w")
    private BigDecimal weight;
    @JSONField(name = "state")
    private String state;
    @JSONField(name = "dn")
    private String displayName;
    @JSONField(name = "dd")
    private String depositDesc;
    @JSONField(name = "svd")
    private String suspendVisibleDesc;
    @JSONField(name = "swd")
    private String suspendWithdrawDesc;
    @JSONField(name = "sdd")
    private String suspendDepositDesc;
    @JSONField(name = "wd")
    private String withdrawDesc;
}
