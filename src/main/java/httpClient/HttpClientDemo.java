package httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Created by WangNing.
 * Date: 2018/6/5
 * Time: 17:00
 */
public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        test_get();
    }
    public static void test_get() throws Exception{
        //创建一个httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个GET对象
        HttpGet get = new HttpGet("http://172.28.34.22:8080/loancore/user/home");
        //执行请求
        CloseableHttpResponse response = httpClient.execute(get);
        //获取响应结果
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        //得到实体
        HttpEntity entity = response.getEntity();
        //是一个entity对象
        String string = EntityUtils.toString(entity,"utf-8");
        System.out.println(string);
        //关闭httpclient
        response.close();
        httpClient.close();
    }
}


