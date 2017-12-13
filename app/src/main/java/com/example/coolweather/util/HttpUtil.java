package com.example.coolweather.util;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by VULCAN on 2017/12/6.
 */

public class HttpUtil {
//    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) throws IOException {
//        OkHttpClient okHttpClient = new OkHttpClient();
//        Request request = new Request.Builder().url(address).build();
//        okHttpClient.newCall(request).execute();
//
//    }

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
