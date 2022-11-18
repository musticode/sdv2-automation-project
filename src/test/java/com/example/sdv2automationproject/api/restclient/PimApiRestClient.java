package com.example.sdv2automationproject.api.restclient;

import com.example.sdv2automationproject.api.property.PropertyManager;
import com.jayway.restassured.response.ValidatableResponse;

public class PimApiRestClient extends RestClient{
    private static final String API_KEY = PropertyManager.getInstance().getApiKey();

    @Override
    public ValidatableResponse doGet(String url) {
        return null;
    }

    @Override
    public ValidatableResponse doPost(String url, String body) {
        return null;
    }

    @Override
    public ValidatableResponse doPatch(String url, String body) {
        return null;
    }

    @Override
    public ValidatableResponse doPut(String url, String body) {
        return null;
    }

    @Override
    public ValidatableResponse doDelete(String url, String body) {
        return null;
    }
}
