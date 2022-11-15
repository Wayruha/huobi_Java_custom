package com.huobi.service.huobi.parser.generic;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huobi.model.generic.SupportedCurrency;
import com.huobi.service.huobi.parser.HuobiModelParser;

import java.util.ArrayList;
import java.util.List;

public class SupportedCurrencyParser implements HuobiModelParser<SupportedCurrency> {
    @Override
    public SupportedCurrency parse(JSONObject json) {
        return json.toJavaObject(SupportedCurrency.class);
    }

    @Override
    public SupportedCurrency parse(JSONArray json) {
        return null;
    }

    @Override
    public List<SupportedCurrency> parseArray(JSONArray jsonArray) {
        if (jsonArray == null || jsonArray.size() <= 0) {
            return new ArrayList<>();
        }

        List<SupportedCurrency> list = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            list.add(parse(jsonArray.getJSONObject(i)));
        }

        return list;
    }
}
