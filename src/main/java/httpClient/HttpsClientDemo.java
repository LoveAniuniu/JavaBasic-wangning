package httpClient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by WangNing.
 * Date: 2018/6/6
 * Time: 14:50
 * https协议的get请求
 */
public class HttpsClientDemo {
    public static void main(String[] args) throws Exception {
        test_https();
    }

    public static HttpClientConnectionManager init(){
        try {
            SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, new TrustStrategy(){
                public boolean isTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                    return true;
                }
            }).build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory( sslContext, new String[] { "TLSv1" }, null,SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            Registry registry = RegistryBuilder.create().register("http", PlainConnectionSocketFactory.INSTANCE).register("https", sslsf).build();
            return new PoolingHttpClientConnectionManager(registry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void test_https() throws Exception {
        HttpClientConnectionManager clientConnectionManager = init();
        if(clientConnectionManager != null){
            CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(clientConnectionManager).build();
            String url = "https://wwww.baidu.com";
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse resp = httpClient.execute(httpGet);
            System.out.println(resp.getStatusLine());
            String string = EntityUtils.toString(resp.getEntity(),"utf-8");
            System.out.println(string);
            resp.close();
            httpClient.close();
        }
    }

}
