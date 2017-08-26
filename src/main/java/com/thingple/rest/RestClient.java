package com.thingple.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class RestClient {

    private RestTemplate template;

    public RestClient() {
        this.template = new RestTemplate();
    }

    public static RestClient newInstance() {
        RestClient ins = new RestClient();
        return ins;
    }

    public void get(String url, Map<String, String> params) {
        ResponseEntity<String> entity = template.getForEntity(url, String.class, params);
        String body = entity.getBody();

    }

    /**
     * Created by lism on 2017/6/2.
     */

    public static interface RestListener {

        void onError();

        void onSuccess();

    }
}
