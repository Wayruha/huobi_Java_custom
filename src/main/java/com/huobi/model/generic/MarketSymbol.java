package com.huobi.model.generic;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MarketSymbol {
    @JSONField(name = "symbol")
    private String symbol;
    @JSONField(name = "bc")
    private String baseCurrency;
    @JSONField(name = "qc")
    private String quoteCurrency;
    @JSONField(name = "state")
    private String state;
    @JSONField(name = "sp")
    private String symbolPartition;
    @JSONField(name = "tags")
    private String tags;
    @JSONField(name = "lr")
    private BigDecimal leverageRatio;
    @JSONField(name = "smlr")
    private BigDecimal superMarginLeverageRatio;
    @JSONField(name = "pp")
    private Integer pricePrecision;
    @JSONField(name = "ap")
    private Integer amountPrecision;
    @JSONField(name = "vp")
    private Integer valuePrecision;
    @JSONField(name = "minoa")
    private BigDecimal minOrderAmt;
    @JSONField(name = "maxoa")
    private BigDecimal maxOrderAmt;
    @JSONField(name = "minov")
    private BigDecimal minOrderValue;
    @JSONField(name = "lominoa")
    private BigDecimal limitOrderMinOrderAmt;
    @JSONField(name = "lomaxoa")
    private BigDecimal limitOrderMaxOrderAmt;
    @JSONField(name = "lomaxba")
    private BigDecimal limitOrderMaxBuyAmt;
    @JSONField(name = "lomaxsa")
    private BigDecimal limitOrderMaxSellAmt;
    @JSONField(name = "smminoa")
    private BigDecimal sellMarketMinOrderAmt;
    @JSONField(name = "smmaxoa")
    private BigDecimal sellMarketMaxOrderAmt;
    @JSONField(name = "bmmaxov")
    private BigDecimal buyMarketMaxOrderValue;
    @JSONField(name = "blmlt")
    private BigDecimal buyLimitMustLessThan;
    @JSONField(name = "slmgt")
    private BigDecimal sellLimitMustGraterThen;
    @JSONField(name = "msormlt")
    private BigDecimal marketSellOrderRateMustLessThan;
    @JSONField(name = "mbormlt")
    private BigDecimal marketBuyOrderRateMustLessThan;
    @JSONField(name = "maxov")
    private BigDecimal maxOrderValue;
}
