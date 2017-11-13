package com.thingple.rest;

/**
 *
 * Created by lism on 2017/9/1.
 */

public interface RequestListener<T> {

    void onSuccess(T data);

    void onFailed(Exception error);
}
