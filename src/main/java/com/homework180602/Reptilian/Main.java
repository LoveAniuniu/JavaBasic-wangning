package com.homework180602.Reptilian;

import httpClient.HttpRequest;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WangNing.
 * Date: 2018/6/7
 * Time: 16:44
 */
public class Main {
    public static void main(String[] args)throws Exception {
        String url = "http://www.zhenai.com/zhenghun";
        Map<String,String> head = new HashMap<String,String>();
        JSONObject json = HttpRequest.get(url,null,head);
        System.out.println(json.getString("data"));
    }
}
