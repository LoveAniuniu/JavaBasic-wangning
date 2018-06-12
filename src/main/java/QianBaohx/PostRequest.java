package QianBaohx;

import org.apache.http.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.HttpParams;

/**
 * Created by WangNing.
 * Date: 2018/6/6
 * Time: 18:12
 */
public class PostRequest {
    public static void postRequest(String url){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpRequest request = new HttpRequest() {
            @Override
            public RequestLine getRequestLine() {
                return null;
            }

            @Override
            public ProtocolVersion getProtocolVersion() {
                return null;
            }

            @Override
            public boolean containsHeader(String s) {
                return false;
            }

            @Override
            public Header[] getHeaders(String s) {
                return new Header[0];
            }

            @Override
            public Header getFirstHeader(String s) {
                return null;
            }

            @Override
            public Header getLastHeader(String s) {
                return null;
            }

            @Override
            public Header[] getAllHeaders() {
                return new Header[0];
            }

            @Override
            public void addHeader(Header header) {

            }

            @Override
            public void addHeader(String s, String s1) {

            }

            @Override
            public void setHeader(Header header) {

            }

            @Override
            public void setHeader(String s, String s1) {

            }

            @Override
            public void setHeaders(Header[] headers) {

            }

            @Override
            public void removeHeader(Header header) {

            }

            @Override
            public void removeHeaders(String s) {

            }

            @Override
            public HeaderIterator headerIterator() {
                return null;
            }

            @Override
            public HeaderIterator headerIterator(String s) {
                return null;
            }

            @Override
            public HttpParams getParams() {
                return null;
            }

            @Override
            public void setParams(HttpParams httpParams) {

            }
        }
        HttpResponse response = httpClient.execute(url);
    }

}
