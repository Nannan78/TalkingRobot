package com.nan.connection;

import com.nan.robots.TuLingRobot;

public class TuLingConnection {
    private static final String requestUrl = "http://openapi.tuling123.com/openapi/api/v2";
    /**
     * 在图灵机器人官网注册登陆后，在右上角产生你的useId；
     * 创建机器人后，生成apiKey
     */
    private static final String apiKey = "apiKey";
    private static final String userId = "userId";

    private static final String contentType = "application/json";

    public static String getResponse(String request) {
        String response = TuLingRobot.getResponse(request,requestUrl,apiKey,userId,contentType);
        return response;
    }

}
