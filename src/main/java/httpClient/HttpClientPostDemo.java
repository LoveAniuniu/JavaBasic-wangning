package httpClient;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangNing.
 * Date: 2018/6/5
 * Time: 18:41
 */
public class HttpClientPostDemo {
    public static void main(String[] args) throws Exception {
        test_post();
    }
    public static void test_post()throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个post对象
        HttpPost post = new HttpPost("http://localhost:8090/test_json");
        //创建一个Entity，模拟一个表单
        List<NameValuePair> kvList = new ArrayList<NameValuePair>();
        kvList.add(new BasicNameValuePair("name","andashu"));
        //包装成一个Entity对象
        StringEntity entity = new UrlEncodedFormEntity(kvList,"utf-8");
        //设置请求的内容
        post.setEntity(entity);
        //执行post请求
        CloseableHttpResponse response= httpClient.execute(post);
        String string = EntityUtils.toString(response.getEntity());
        System.out.println(string);
        response.close();
        httpClient.close();
    }

}
