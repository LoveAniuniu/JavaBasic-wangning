package com.homework180526;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * Created by WangNing.
 * Date: 2018/5/28
 * Time: 17:34
 */
public class FileList {
    public static void main(String[] args) throws IOException {
        File file = new File("Demo\\java\\com\\");
        //System.out.println(file.getCanonicalPath());
        listFile(file);
    }

    public static void listFile(File file) throws IOException {
        showFile(file);//显示一个目录下的所有文件
        File[] files=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();//判断文件是否是一个目录
            }
        });
        for (File ff:files) {
            listFile(ff);//如果是一个目录，判断该目录下是否还有目录文件
        }

    }
    //显示一个目录下的所有文件
    public static void showFile(File file) throws IOException {
      if(file.isDirectory()){
          System.out.println(file.getCanonicalPath());
          File[] files =file.listFiles(new FileFilter() {
              @Override
              public boolean accept(File f) {
                  //返回是否是一个文件
                  return f.isFile();
              }
          });
          for (File f1:files) {
              System.out.println(f1.getName());//是文件就返回文件名
          }
      }
    }

}
