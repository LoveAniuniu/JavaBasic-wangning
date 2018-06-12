package httpClient;

import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;

import java.net.URI;
import java.util.List;

/**
 * Created by WangNing.
 * Date: 2018/6/6
 * Time: 11:57
 */
public class HttpClientRedirectDemo {
    public static void main(String[] args) throws Exception{
        test_CDX();

    }

    public static void test_CDX() throws Exception{
        LaxRedirectStrategy redirectStrategy = new LaxRedirectStrategy();
        CloseableHttpClient httpclient = HttpClients.custom().setRedirectStrategy(redirectStrategy).build();
        HttpClientContext context = HttpClientContext.create();
        HttpPost httpPost = new HttpPost("http://172.28.34.22:8080/loancore/user/home");
//        List<NameValuePair> kvList = new ArrayList<>();
//        kvList.add(new BasicNameValuePair("LoginForm[username]","admin"));
//        kvList.add(new BasicNameValuePair("LoginForm[password]","123456"));
//        kvList.add(new BasicNameValuePair("LoginForm[language]","zh_cn"));
//        kvList.add(new BasicNameValuePair("LoginForm[rememberMe]","0"));
//        StringEntity entity = new UrlEncodedFormEntity(kvList,"utf-8");
//        httpPost.setEntity(entity);
        CloseableHttpResponse response = httpclient.execute(httpPost, context);
        HttpHost target = context.getTargetHost();
        List<URI> redirectLocations = context.getRedirectLocations();
        System.out.println(redirectLocations);
        URI location = URIUtils.resolve(httpPost.getURI(), target, redirectLocations);
        System.out.println("Final HTTP location: " + location.toASCIIString());

    }
}
