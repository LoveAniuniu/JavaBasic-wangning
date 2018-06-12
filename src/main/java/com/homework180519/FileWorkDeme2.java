package com.homework180519;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WangNing.
 * Date: 2018/5/25
 * Time: 15:33
 *
 */
public class FileWorkDeme2 {
    File f = null;
    public void creatDir(String Dirname) {
        f= new File(Dirname);
//        System.out.println(Dirname+"的父目录是"+f.getParentFile());
        if (f.exists()) {
            System.out.println(Dirname+"存在该目录");
        } else {
            f.mkdir();
            System.out.println(Dirname+"创建成功");
        }
    }

    public void creatFile(String Filename) {
        f = new File(Filename);
        if (f.exists()) {
            System.out.println(Filename+"存在该文件");
        } else {
            try {
                f.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("test.txt的绝对路径名是："+f.getAbsolutePath());
        System.out.println("test.txt的文件长度是："+f.length());


        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(f.lastModified());
        System.out.println("test.txt的创建时间是："+sdf.format(date));
    }

    public void showDir(String Dirname){
        File f = new File(Dirname);
        File[] ff = f.listFiles();
        for (File fs:ff) {
            System.out.println("demo文件夹的内容："+fs.getAbsolutePath());//显示demo文件夹的内容
        }
    }


    public static void main(String[] args){
        String Dirname="D:\\wangning\\Demo";
        String Filename="D:\\wangning\\Demo\\text.txt";
        FileWorkDeme2 fwd = new FileWorkDeme2();
        fwd.creatDir(Dirname);
        fwd.creatFile(Filename);
        fwd.showDir(Dirname);

    }
}
