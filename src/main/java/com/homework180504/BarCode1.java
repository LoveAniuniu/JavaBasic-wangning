package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/14
 * Time: 15:15
 */
public class BarCode1 {
    public static void main(String[] args) {
        System.out.println(gen("690128599120"));
        System.out.println(check("6901285991202"));

    }
    public static boolean check(String code){
        if(code.length()==13) {
            int x = gen(code.substring(0, 12));
            int n = code.charAt(12) - '0';
            return x == n;
        }else {
            return false;
        }
    }

    public static int gen(String code){
        if(code.length()==12) {
            char[] ch = code.toCharArray();//把字符串转成数组
            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i<ch.length; i += 2) {
                c1 = c1 + (ch[i] - '0');
                c2 = c2 + (ch[i + 1] - '0');
            }
            int c = c1 + c2 * 3;
            //return c%10 == 0?0:10-c%10;
            int x = c % 10;
            if (x == 0) {
                return 0;
            } else {
                return 10 - x;
            }
        }else {
            return -1;
        }

    }
}
