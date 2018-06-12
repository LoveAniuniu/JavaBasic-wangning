package com.homework180519;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by WangNing.
 * Date: 2018/5/25
 * Time: 16:53
 * 打印指定目录下的所有Java文件
 */

public class FileWorkDemo {
    public static void main(String[] args) {
        File f = new File("Demo/java/com/homework180519");
        File[] file = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".java");
            }
        });
        for (File f1:file) {
            System.out.println("目录下所有的Java文件有"+f1.getAbsolutePath());
        }
    }
}
