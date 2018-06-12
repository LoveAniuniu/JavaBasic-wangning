package com.homework180519;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by WangNing.
 * Date: 2018/5/25
 * Time: 17:20
 * //列出某一个文件夹的所有文件以及目录（包含子目录）
 * 没有做出来，结果不正确
 */
public class AllFileNum {
    public static void main(String[] args) {
        File file = new File("Demo/java/com/");
        fileList(file);
    }


    public static void fileList(File file){
        showFile(file);
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        });
        for (File ff:files) {
            fileList(ff);
        }
    }

    public static void showFile(File file){
        if (file.isDirectory()) {
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.isFile();
                }
            });
            for (File f:files) {
                System.out.println(f.getName());
            }
        }
    }

}
