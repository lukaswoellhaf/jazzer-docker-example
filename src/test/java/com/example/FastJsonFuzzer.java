package com.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;

class FastJsonFuzzer {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        try {
            JSON.parse(data.consumeRemainingAsString());
        } catch (JSONException ignored) {
        }
    }
}
