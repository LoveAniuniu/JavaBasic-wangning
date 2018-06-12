package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/11
 * Time: 17:13
 */
public class ForDemo {
    public static void main(String[] args){
        ForDemo f=new ForDemo();
        f.Break();
        System.out.println("==========================================");
        f.Continue();
        System.out.println("==========================================");
        f.Return();
        System.out.println("==========================================");
    }

    public void Break() {
        for (int j = 0; j<3; j++) {
            for (int i = 0; i<3; i++) {
                if (i == 1) {
                    break;  // //break是跳出一层循环
                }
                System.out.println("i的值是" + i +"；" + "j的值是"+j);
            }
        }
    }

    public void Continue() {
        // 一个简单的for循环
        for (int j = 0; j<3; j++) {
            for (int i = 0; i<3; i++) {
                if (i == 1) {
                    continue;//continue是结束一趟循环
                }
                System.out.println("i的值是" + i +"；" + "j的值是"+j);
            }
        }
    }

    public void Return() {
        for (int j = 0; j<3; j++) {
            for (int i = 0; i<2; i++) {
                if (i == 1) {
                    return;//return才是结束所有层循环
                }
                System.out.println("i的值是" + i+"；"+"j的值是"+j);
            }
        }
    }

}





