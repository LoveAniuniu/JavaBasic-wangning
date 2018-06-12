package httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Created by WangNing.
 * Date: 2018/6/5
 * Time: 18:10
 */
public class HttpClientDemo2 {
    public static void main(String[] args) throws Exception {
        test_getAndArgs();
    }

    public static void test_getAndArgs() throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder("http://localhost:8090/test_json");
        uriBuilder.addParameter("name","besttest");
//        URIBuilder uriBuilder = new URIBuilder("http://localhost:8090/test_json?name=besttest");
        HttpGet get = new HttpGet(uriBuilder.build());

        CloseableHttpResponse response = httpClient.execute(get);
        int statusCode =response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        HttpEntity entity =response.getEntity();
        String string = EntityUtils.toString(entity,"utf-8");
        System.out.println(string);
        response.close();
        httpClient.close();

    }
}
