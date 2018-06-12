package com.homework180602;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by WangNing.
 * Date: 2018/6/7
 * Time: 9:54
 */
public class HttpRequest {
    //日志
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(httpClient.HttpRequest.class);
    //日志的开关
    public static boolean debug = false;

    public static JSONObject  get(String link, Map<String, Object> dataMap, Map<String, String> headMap) throws  Exception {
        if (dataMap.size()>0 && dataMap != null) {
            link += "?" + MapToHttpString(dataMap);
            //logger.info("请求的data:" + mapToJson(dataMap));
        }
        //打印出url
        logger.info("请求的url=" + link);
        //创建一个httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建get请求方法，并指定请求URL
        HttpGet httpget = new HttpGet(link);
        //添加header信息
        addHeaders(httpget, headMap);
        //打印出头信息
        debugHeader(httpget.getAllHeaders());
        //打印出get请求前的时间
        long beginTime = System.currentTimeMillis();
        //调用HttpClient对象的execute发送请求，该方法返回一个HttpResponse。
        CloseableHttpResponse response = httpClient.execute(httpget);
        //打印出get请求后的时间
        long endTime = System.currentTimeMillis();
        //得到头的信息
        Map<String,String> headers = getHeaderMap(response);
        //得到cookie信息
        Map<String,String> cookies = getCookieMap(headers.get("Set-Cookie"));
        //获取请求返回状态码
        int code = response.getStatusLine().getStatusCode();
        //调用HttpResponse的getEntity()方法可获取HttpEntity对象，该对象包装了服务器的响应内容
        HttpEntity entity = response.getEntity();
        // 把获取到的实体对象进行编码转换
        String resultString = EntityUtils.toString(entity, "utf-8");
        logger.info("请求的返回code:" + code);
        logger.info("请求的返回data:" + resultString);
        //返回
        return getReturnJSON(resultString, code,headers,cookies,beginTime,endTime);
    }

    public static JSONObject post(String link,Map<String,Object> param,Map<String,String> headMap)throws Exception{
        //打印出post请求的url
        logger.info("请求的url:"+link);
        //通过调用mapToJson打印出json格式的参数
        logger.info("请求的data:"+mapToJson(param));
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建post请求方法，并传入url
        HttpPost httpPost = new HttpPost(link.toString());
        // 调用HttpResponse的getEntity()方法获取httpEntity对象，该对象包含服务器的响应内容
        httpPost.setEntity(new StringEntity(MapToHttpString(param)));
        //添加请求头
        addHeaders(httpPost,headMap);
        //debugHeader打印出请求头
        debugHeader(httpPost.getAllHeaders());
        long beginTime = System.currentTimeMillis();
        //调用httpClient对象的execute方法，并获取请求后的response
        HttpResponse response = httpClient.execute(httpPost);
        long endTime = System.currentTimeMillis();
        //获取头信息
        Map<String,String> headers = getHeaderMap(response);
        //获取cookie信息
        Map<String,String> cookies = getCookieMap(headers.get("Set-Cookie"));
        int code = response.getStatusLine().getStatusCode();// 返回状态码
        HttpEntity entity = response.getEntity();
        // 把内容转成字符串
        String resultString = EntityUtils.toString(entity,"utf-8");
        logger.info("请求的返回code:" + code);
        logger.info("请求的返回data:" + resultString);
        return getReturnJSON(resultString, code,headers,cookies,beginTime,endTime);
    }


    public static JSONObject put(String link,Map<String,Object> dataMap,Map<String,String> headMap) throws Exception{
        logger.info("请求的url:" + link);
        logger.info("请求的data:" + mapToJson(dataMap));
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPut httpPut = new HttpPut(link.toString());
        httpPut.setEntity(new StringEntity(mapToJson(dataMap),HTTP.UTF_8));
        addHeaders(httpPut,headMap);
        debugHeader(httpPut.getAllHeaders());
        long beiginTime = System.currentTimeMillis();
        HttpResponse response = httpClient.execute(httpPut);
        long endTime = System.currentTimeMillis();
        Map<String,String> headers = getHeaderMap(response);
        Map<String,String> cookies = getCookieMap(headers.get("Set-Cookie"));
        int code = response.getStatusLine().getStatusCode();// 返回状态码
        HttpEntity entity = response.getEntity();
        // 把内容转成字符串
        String resultString = EntityUtils.toString(entity);
        logger.info("请求的返回code:" + code);
        logger.info("请求的返回data:" + resultString);
        return getReturnJSON(resultString, code,headers,cookies,beiginTime,endTime);
    }

    public static JSONObject delete(String link,Map<String,Object> dataMap,Map<String, String> headMap) throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        if (dataMap!=null && dataMap.size() >0 ){
            link += "?" + MapToHttpString(dataMap);
        }
        logger.info("请求的url:" + link);
        HttpDelete httpDelete = new HttpDelete(link);
        addHeaders(httpDelete,headMap);
        debugHeader(httpDelete.getAllHeaders());
        long beginTime = System.currentTimeMillis();
        HttpResponse response = httpClient.execute(httpDelete);
        long endTime = System.currentTimeMillis();
        Map<String,String> headers = getHeaderMap(response);
        Map<String,String> cookies = getCookieMap(headers.get("Set-Cookie"));
        int code = response.getStatusLine().getStatusCode();
        HttpEntity entity = response.getEntity();
        String resultString = EntityUtils.toString(entity);
        logger.info("请求的返回code:" + code);
        logger.info("请求的返回data:" + resultString);
        return getReturnJSON(resultString, code, headers,cookies,beginTime,endTime);
    }


    //把请求的参数封装成json格式
    public static String MapToHttpString(Map<String,Object> params){
        String dataString = "";
        if(params == null || params.isEmpty()){
            return dataString;
        }
        try {
            for(String key : params.keySet()) {
                dataString += key + "=" + URLEncoder.encode(String.valueOf(params.get(key)), "utf-8");
            }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return dataString.substring(0,dataString.length()-1);
    }

    //把请求头的信息封装成headMap中
    public static void addHeaders(HttpRequestBase httpRequest,Map<String,String> headMap){
        httpRequest.setHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
        httpRequest.setHeader(HTTP.USER_AGENT, "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.106 Safari/537.36");
        httpRequest.setHeader("Accept", "application/json,text/javascript,*/*");
        for (String key :headMap.keySet()){
            httpRequest.setHeader(key,headMap.get(key));
        }
    }

    public static void debugHeader(Header[] headers){
        if (debug){
            for(Header header:headers){
                logger.info("header:" +header.getName() + ":" +header.getValue());
            }
        }
    }


    //获取响应结果response中的头信息
    public static Map<String,String> getHeaderMap(HttpResponse response){
        Map<String,String> map = new HashMap<String,String>();
        Header[] headers = response.getAllHeaders();
        for (Header header:headers){
            String key = header.getName();
            if (map.containsKey(key)){
                map.put(key,map.get(key)+":"+header.getValue());
            }else {
                map.put(key,header.getValue());
            }
        }
        return map;
    }

    //获取响应结果response中的cookie信息
    public static Map<String,String> getCookieMap(String cookieStr){
        Map<String,String> map = new HashMap<String,String>();
        if (cookieStr == null){
            return map;
        }
        String[] cookieArray = cookieStr.split(":");
        for (String s: cookieArray){
            if (s.indexOf("=")>0){
                String[] ss = s.split("=");
                map.put(ss[0],ss[1]);
            }
        }
        return map;
    }

    //把httpcode、header、cookie、beginTime、endTime封装成json格式
    public static JSONObject getReturnJSON(String result, int Httpcode,Map<String,String> headers,Map<String,String> cookies, long beginTime,long endTime) throws  Exception{
        JSONObject JS = new JSONObject();
        try {
            JS.put("httpcode", Httpcode);
            JS.put("header", new JSONObject(headers));
            JS.put("cookie", new JSONObject(cookies));//cookie信息
            JS.put("beginTime", beginTime);//开始时间
            JS.put("endTime", endTime);//结束时间
            if (result.startsWith("{")) {
                JS.put("data", new JSONObject(result));
            } else {
                JS.put("data", result);
            }
        }catch (Exception e){
            JS.put("data",result);
        }
        return JS;
    }

    //把请求参数dataMap转成json格式并返回string类型
    public static String mapToJson(Map<String, Object> dataMap) {
        JSONObject js = new JSONObject(dataMap);
        return js.toString();
    }


}
