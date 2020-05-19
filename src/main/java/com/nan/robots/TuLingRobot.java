package com.nan.robots;

import com.nan.util.HttpUtil;
import org.json.JSONArray;
import org.json.JSONObject;

public class TuLingRobot {
    public static String getResponse(String request,String requestUrl,String apiKey,String userId,String contentType){
        JSONObject perception = new JSONObject();
        JSONObject inputText = new JSONObject();
        inputText.put("text", request);
        perception.put("inputText", inputText);

        JSONObject userInfo = new JSONObject();
        userInfo.put("apiKey", apiKey);
        userInfo.put("userId", userId);

        JSONObject root = new JSONObject();
        root.put("reqType", 0);
        root.put("perception", perception);
        root.put("userInfo", userInfo);
        String params = root.toString();

        System.out.println(params);

        try {
            String resultString = HttpUtil.postGeneralUrl(requestUrl, contentType, params, "UTF-8");

            JSONObject resultJson = new JSONObject(resultString);
            JSONArray results = resultJson.getJSONArray("results");
            JSONObject values = ((JSONObject)(results.get(0))).getJSONObject("values");
            String text = values.getString("text");
            return text;
        } catch (Exception e) {
            e.printStackTrace();
            return "我不知道怎么回答你";
        }
    }

}
