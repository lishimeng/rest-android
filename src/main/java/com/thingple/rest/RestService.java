package com.thingple.rest;

import java.util.concurrent.ExecutorService;

/**
 *
 * Created by lism on 2017/9/1.
 */

public class RestService {

    private static RestService instance;

    private RestClient restClient;

    private ExecutorService executorService;

    public static RestService shareInstance() {
        return instance;
    }

    public static void init() {
        instance = new RestService();
    }

    private RestService() {
        restClient = new RestClient();
    }

    public void emit() {
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    public void destroy() {
        ExecutorService es = executorService;
        executorService = null;
        if (es != null && !es.isShutdown()) {
            es.shutdown();
        }
    }
}
