package com.homework180602;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by WangNing.
 * Date: 2018/6/7
 * Time: 9:55
 */
public class HttpDownload {
    public static void main(String[] args) throws Exception{
        //1、创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2、创建get方法的实例，并指定请求的url
        HttpGet get =new HttpGet("http://localhost:8090/download");
        //3、调用httpClient对象的execute发送请求，并返回一个HttpResponse
        HttpResponse response =httpClient.execute(get);
        //4、调用HttpResponse的getEntity()方法可获取HttpEntity对象，该对象包含了服务器的响应内容
        HttpEntity entity =response.getEntity();
        InputStream in = entity.getContent();
        File file = new File("wangning-xiaowangzi.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream out = new FileOutputStream(file);
        byte[] buffer = new byte[4096];
        int readLength = 0;
        while ((readLength=in.read(buffer)) > 0) {
            byte[] bytes = new byte[readLength];
            System.arraycopy(buffer, 0, bytes, 0, readLength);
            out.write(bytes);
        }
        out.flush();
        out.close();
        httpClient.close();

    }
}
