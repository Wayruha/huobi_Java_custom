package com.huobi.client;

import java.util.List;

import com.huobi.client.req.generic.CurrencyChainsRequest;
import com.huobi.constant.Options;
import com.huobi.constant.enums.ExchangeEnum;
import com.huobi.exception.SDKException;
import com.huobi.model.generic.*;
import com.huobi.service.huobi.HuobiGenericService;

public interface GenericClient {

  String getSystemStatus();

  MarketStatus getMarketStatus();

  List<Symbol> getSymbols();

  List<SymbolV2> getSymbolsV2();

  List<MarketSymbol> getMarketSymbols();

  List<String> getCurrencys();

  List<CurrencyChain> getCurrencyChains(CurrencyChainsRequest request);

  Long getTimestamp();

  static GenericClient create(Options options) {

    if (options.getExchange().equals(ExchangeEnum.HUOBI)) {
      return new HuobiGenericService(options);
    }
    throw new SDKException(SDKException.INPUT_ERROR, "Unsupport Exchange.");
  }
}
