package com.homework180519;
import java.io.File;

/**
 * Created by WangNing.
 * Date: 2018/5/25
 * Time: 14:34
 *
 */

//问题：想把要查找的文件夹写成一个变量的形式，这种当当前文件夹下有多个文件目录时，新建目录时创建不成功
public class FileWorkDemo1 {
    public static void main(String[] args) {
        FindList fl = new FindList();
        fl.FindList();
    }
}


class FindList{
    public void FindList(){
        String currentStr="d:\\wangning\\";
        String str = "demo";
        String sstr = currentStr+str;

        File f = new File(currentStr);
        File ff = new File(sstr);
        System.out.println("当前路径是"+f.getAbsolutePath());
        System.out.println("当前路径是"+ff.getAbsolutePath());

        File[] file =f.listFiles();
        for (File f1:file){
            //方法一：
//            if(f1.getName().equals(str)){
//                System.out.println(f1.getName()+"文件夹中包含"+str+"目录");
//            }else {
//                System.out.println(f1.getName()+"当前文件夹中没有"+str+"目录");
//            }
            //方法二
            System.out.println(!((f1.getName().equals(str))?true:false));
            if((f1.getName().equals(str))?true:false){
                System.out.println(f1.getName()+"文件夹中包含"+str+"目录");
            }else {
                ff.mkdir();
                System.out.println("创建成功");
            }
        }

        System.out.println("==================================");
        //方法三
        for (int i=0;i<file.length;i++){
            if (file[i].getName().equals(str)){
                System.out.println(file[i].getName()+"文件夹中包含"+str+"目录");
            }else {
                System.out.println(file[i].getName()+"当前文件夹中没有"+str+"目录");
            }
        }
    }
}