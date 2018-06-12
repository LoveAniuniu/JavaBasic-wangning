package com.homework180519;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/25
 * Time: 10:32
 * 文件流
 */
//文件流分为2类：
//    1、字节流：可以用于读写二进制文件及任何类型文件 byte
//    2、字符流：可以用于读写文本文件，不能操作二进制文件
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("D:\\wangning\\Demo\\java\\com\\homework180519");

        System.out.println(f.getName()); //返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.length()); //此抽象路径名表示的文件的长度。byte
        System.out.println(f.exists());     //此抽象路径名表示的文件或目录是否存在
        System.out.println(f.getAbsolutePath());//返回此抽象路径名的绝对路径名字符串
//        f.createNewFile();//当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。

        if (!f.exists()){
            f.mkdir();
        }else {
            System.out.println("该路径已经存在");
        }

        //list()方法，以字符串数组形式返回f目录中的文件和文件名
        String[] ss = f.list();
        System.out.println(Arrays.toString(ss));

        //listFiles() 返回的都是File格式的文件
        if(f.isDirectory()){
            File list[] = f.listFiles();  //返回一个抽象路径名数组。
            for(int i=0;i<list.length;i++){
                System.out.println("文件名："+list[i].getName());
            }
        }

        File[] ff = f.listFiles();
        for (File fg:ff) {
            System.out.println(fg.isDirectory()+":"+fg.getAbsoluteFile());
        }

        //创建一个过滤器方法 listFiles(FilenameFilter filter)
        //返回一个满足指定过滤器的文件和文件名的抽象路径名数组
        File[] files = f.listFiles(new MyFilter());
        System.out.println("==========");
        for(File fs:files){
            System.out.println(fs.getName());
        }

        System.out.println("=====11111111=====");

        //通过匿名内部类的方式，获取满足条件的文件、文件名
        File[] fi = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".java");
            }
        });
        for (File fe:fi){
            System.out.println(fe.getName());
        }
    }
}

//实现一个过滤器的接口
class MyFilter implements FileFilter{
    @Override
    public boolean accept(File f) {
        return f.isDirectory();
    }
}