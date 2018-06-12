package com.homework180526;

import java.io.*;

/**
 * Created by WangNing.
 * Date: 2018/5/28
 * Time: 19:43
 */
public class InputStreamDemo {
    public static void main(String[] args) throws Exception {
//        //字节流
//        FileInputStream fis = new FileInputStream("Demo/java/com/homework180526");//如果是视频，格式如左
//        //转换流
//        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
//        //BufferReader
//        BufferedReader br = new BufferedReader(isr);
        //读的是文件，格式如下：
        BufferedReader br2 = new BufferedReader(
                new InputStreamReader(
                        new BufferedInputStream(
                                new FileInputStream("Demo/java/com/homework180526/test.txt"))));
        String str;
        while ( (str=br2.readLine()) != null){//读取文件中所有内容
            System.out.println(str);
        }
        br2.close();

        PrintWriter out = new PrintWriter(
                new OutputStreamWriter(
                        new BufferedOutputStream(new FileOutputStream("Demo/java/com/homework180526/out.txt"))));
        out.println("hello");
        out.println("xiao Pang");
        out.print("Java study");
        out.flush();
        out.close();
    }
}
