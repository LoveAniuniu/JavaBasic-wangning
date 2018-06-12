package com.homework180414;

public class Barcode {
    static int c1=0;
    static int c2=0;
    static int cc=0;
    static int bin;
    public static void init(String code){
        for (int j = 0; j < code.length(); j++) {
            if (j % 2 == 0){
                int s1 = Integer.parseInt(code.substring(j, j + 1));
                c1 = c1 + s1;//奇数位
            } else {
                int s2 = Integer.parseInt(code.substring(j, j + 1));
                c2 = c2 + s2;//偶数位
            }
        }
    }

    //根据12位条码生成第13位校验码
    public static int gen() {
        init("690123456789");
        cc = c1 + c2 * 3; //奇数位之和与偶数位之和的三倍相加
        if (cc % 10 != 0) {
            bin = 10 - cc%10;
        } else {
            bin = 0;
        }
        return bin;
    }

    //检查第13位校验码是否正确
    public static boolean check(String code){
        init("6901234567892");
        cc = c1 + c2*3; //奇数位之和与偶数位之和的三倍相加
        if(cc%10 !=0){
            bin = 10-cc%10;
        }else {
            bin = 0;
        }
        Integer lastnum = Integer.valueOf(code.substring(code.length()-1,code.length()));//取出13位条码的最后一位
        if (lastnum.equals(bin)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String []args){
        Barcode c1 =new Barcode();
        //调用public static boolean check(String code)方法，验证13位校验码是否正确
        boolean b1 = c1.check("6901234567892");
        if (b1){
            System.out.println("13位校验码正确");
        }else{
            System.out.println("13位校验码不正确");
        }
        //调用public static int gen(String code)方法，生成第13位校验码
        int lastnum1 = c1.gen();
        System.out.println("根据12位条码生成的第13位校验码是:"+lastnum1);
    }
}



