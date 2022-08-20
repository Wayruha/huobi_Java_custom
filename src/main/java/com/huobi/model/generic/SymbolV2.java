package com.huobi.model.generic;

import com.alibaba.fastjson.annotation.JSONField;
import com.huobi.constant.enums.SymbolState;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SymbolV2 {

    @JSONField(name = "sc")
    String symbol;

    @JSONField(name = "dn")
    String displayName;

    @JSONField(name = "bc")
    String baseCurrency;

    @JSONField(name = "bcdn")
    String baseCurrencyDisplayName;

    @JSONField(name = "qc")
    String quoteCurrency;

    @JSONField(name = "qcdn")
    String quoteCurrencyDisplayName;

    SymbolState state;

    @JSONField(name = "whe")
    boolean whiteEnabled;

    @JSONField(name = "cd")
    boolean countryDisabled;

    @JSONField(name = "te")
    boolean tradeEnabled;

    @JSONField(name = "toa")
    long tradeOpenTime;

    @JSONField(name = "sp")
    String symbolPartition;

    @JSONField(name = "w")
    String weight;

    @JSONField(name = "ttp")
    BigDecimal tradeTotalPrecision;

    @JSONField(name = "tap")
    BigDecimal tradeAmountPrecision;

    @JSONField(name = "fp")
    BigDecimal feePrecision;

    @JSONField(name = "suspend_desc")
    String suspendDescription;

    @JSONField(name = "transfer_board_desc")
    String transferBoardDesc;

    String tags;

    @JSONField(name = "lr")
    BigDecimal leverageRation;

    @JSONField(name = "smlr")
    BigDecimal superMarginLeverageRatio;

    @JSONField(name = "flr")
    BigDecimal fundingLeverageRation;

    @JSONField(name = "wr")
    String withdrawRisk;

    @JSONField(name = "d")
    Integer direction;

    @JSONField(name = "elr")
    String ETPLeverageRation;

    @JSONField(name = "castate")
    CA_STATE CAState;

    @JSONField(name = "ca1oa")
    long CA1OpenTime;

    @JSONField(name = "ca2oa")
    long CA2OpenTime;

    public enum CA_STATE {
        ca_1,
        ca_2;
    }
}
