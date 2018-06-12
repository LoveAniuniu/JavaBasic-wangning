package com.homework180602;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by WangNing.
 * Date: 2018/6/7
 * Time: 9:55
 */
public class HttpUpload {
    public static void main(String[] args){
        File file = new File("Demo/java/com/homework180602/wangning-xiaowangzi.txt");
        postFile(file);
    }

    public static String postFile(File file)  {
        ///1、创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2、创建post请求方法，并指定请求URL
        HttpPost httpPost = new HttpPost("http://localhost:8090/upload");
        // MultipartEntityBuilder可以生成 form 表单格式的 HttpEntity
        MultipartEntityBuilder nEntity = MultipartEntityBuilder.create();
        nEntity.addBinaryBody("file", file);
        //3、调用setEntity(HttpEntity entity)方法来设置请求参数
        httpPost.setEntity(nEntity.build());
        //4、调用HttpClient对象的execute(HttpUriRequest request)发送请求，该方法返回一个HttpResponse。
        CloseableHttpResponse response = null;
        String result = null;
        try {
            response = httpClient.execute(httpPost);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                //5、调用HttpResponse的getEntity()方法可获取HttpEntity对象，该对象包装了服务器的响应内容
                HttpEntity entity = response.getEntity();
                result = EntityUtils.toString(entity);
                EntityUtils.consume(entity);
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //6. 释放连接。无论执行方法是否成功，都必须释放连接
            HttpClientUtils.closeQuietly(httpClient);
            HttpClientUtils.closeQuietly(response);
        }
        return result;
    }

}
