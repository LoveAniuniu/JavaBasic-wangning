package work.customer;

import java.text.*;
import java.util.Date;
public class date {
    public static void main(String[] args) {
        ///   打印出2006年11月17日 15时19分56秒
        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //打印   06/11/17 15:19
        SimpleDateFormat myFmt1=new SimpleDateFormat("yy/MM/dd HH:mm");

        //2006-11-17 15:19:56
        SimpleDateFormat myFmt2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //2006年11月17日 15时19分56秒 星期五
        SimpleDateFormat myFmt3=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");

        // 一年中的第 321 天 一年中第46个星期 一月中第3个星期 在一天中15时 CST时区
        SimpleDateFormat myFmt4=new SimpleDateFormat(
                "一年中的第 D 天 一年中第w个星期 一月中第W个星期 在一天中k时 z时区");

        Date now=new Date();
        System.out.println(myFmt.format(now));
        System.out.println(myFmt1.format(now));
        System.out.println(myFmt2.format(now));
        System.out.println(myFmt3.format(now));
        System.out.println(myFmt4.format(now));
        System.out.println(now.toGMTString());// 17 Nov 2006 07:19:56 GMT
        System.out.println(now.toLocaleString());// 2006-11-17 15:19:56
        System.out.println(now.toString());// Fri Nov 17 15:19:56 CST 2006
    }
}