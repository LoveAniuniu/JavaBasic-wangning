package JavaInterface.login;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangNing.
 * Date: 2018/5/10
 * Time: 10:30
 */
public class Login_url {
    HttpURLConnection connection = null;
    String url302;
    public String login_host = "http://172.28.34.26:8080";
  /*  try{
        String urllink = login_host.concat("/qbxdcore/user");
        URL url = new URL(urllink); // 创建远程url连接对象
        connection = (HttpURLConnection) url.openConnection();  // 通过远程url连接对象打开一个连接，强转成httpURLConnection类
        connection.setRequestMethod("GET"); // 设置连接方式：get
        connection.setConnectTimeout(15000);    // 设置连接主机服务器的超时时间：15000毫秒
        connection.setReadTimeout(30000);   // 设置读取远程返回的数据时间：60000毫秒
        connection.connect();   // 发送请求
        connection.setInstanceFollowRedirects(false); // 通过connection连接，获取输入流
        url302 = connection.getHeaderField("Location"); //获取重定向后的url




    } catch(Exception e){
        e.printStackTrace();
    }
    */
}





