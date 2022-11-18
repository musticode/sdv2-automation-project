package com.example.sdv2automationproject.api.test;

import com.example.sdv2automationproject.api.property.FaveoApiPropertyManager;
import com.example.sdv2automationproject.api.restclient.FaveoApiRestClient;
import com.example.sdv2automationproject.api.restclient.RestClient;
import com.jayway.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

public class Sdv2ApiTest {


    String FAVEO_API_MAIN_URL = FaveoApiPropertyManager.getInstance().getFaveoApiUrl();


    ValidatableResponse response;
    RestClient faveoApiRestClient = new FaveoApiRestClient();

    @Test
    public void getAllMspTickets(){
        response = faveoApiRestClient.doGet(FAVEO_API_MAIN_URL.concat("tickets"));
        faveoApiRestClient.responseAsString(response);
//        response.log().body().extract().asString();
    }
}
