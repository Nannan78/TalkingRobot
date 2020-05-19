package com.nan;

import com.nan.connection.HaiZhiConnection;
import com.nan.connection.QingYunKeConnection;
import com.nan.connection.TuLingConnection;
import com.nan.util.JsonFormatTool;

public class TestRobots {
    public static void main(String[] args) throws Exception {
        String response1 = QingYunKeConnection.getResponse("你好啊");
        String response2 = TuLingConnection.getResponse("你好啊");
        String response3 = HaiZhiConnection.getResponseByPost("你好啊");
        System.out.println(new JsonFormatTool().formatJson(response1));
        System.out.println(new JsonFormatTool().formatJson(response2));
        System.out.println(new JsonFormatTool().formatJson(response3));

    }
}
