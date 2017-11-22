package com.thingple.rest;

import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

public class RestClient {

    private RestTemplate template;

    RestClient() {
        this.template = new RestTemplate();
    }

    public static RestClient newInstance() {
        RestClient ins = new RestClient();
        return ins;
    }

    public String get(String url, Map<String, String> params) {
        return template.getForObject(url, String.class, params);
    }

    public String post(String url, Map<String, String> params) {
        return template.postForObject(URI.create(url), params, String.class);
    }

}
