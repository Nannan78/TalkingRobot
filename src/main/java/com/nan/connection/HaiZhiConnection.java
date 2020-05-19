package com.nan.connection;

import com.nan.robots.HaiZhiZhiNengRobot;
import com.nan.util.GsonUtils;
import com.nan.util.JsonFormatTool;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class HaiZhiConnection {
    private static final String url = "http://api.ruyi.ai/v1/message";

    private static final String app_key = "app_key";

    private static final String user_id = UUID.randomUUID().toString();

    public static String getResponseByPost(String  q){
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("q", q);
            map.put("app_key", app_key);
            map.put("user_id", user_id);
            String param = GsonUtils.toJson(map);
            String result = HaiZhiZhiNengRobot.postHaiZhi(url,param);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String getResponseByGet(String  q){
        try {
            String result = HaiZhiZhiNengRobot.getHaiZhi(url,q,app_key,user_id);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
