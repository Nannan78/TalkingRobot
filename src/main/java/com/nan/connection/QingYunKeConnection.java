package com.nan.connection;

import com.nan.robots.QingYunKeRobot;

public class QingYunKeConnection {
    private static final String url = "http://api.qingyunke.com/api.php";

    private static final String key = "free";

    public static String getResponse(String msg) throws Exception {
        String response = QingYunKeRobot.getQingYunKe(url, key,msg);
        return response;
    }
}
