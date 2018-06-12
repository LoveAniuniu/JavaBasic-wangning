package com.homework180512;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by WangNing.
 * Date: 2018/5/18
 * Time: 14:32
 */
public class MapCount {
    public static void main(String[] args) {
        String str="qwerojkljda[kkljl[uiowernvc[m"+
                "ljqwe[klrjknpk]lmkljakl]fjbncz]xklj"+
                "kkas]dfdsfqewrh]gfjryt{ufdvxc{vsad}fcx}as";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();//创建一个hashMap对象
        for(int i=0;i<str.length();i++){//for循环分割字符串
            char c = str.charAt(i);
            /* 方法一 */
            //判断某一个元素在不在map集合的key中
            if(map.containsKey(c)){//判断集合中是否包含字符
                int value = map.get(c); // 返回指定键所映射的值；
                map.put(c,value+1);     // 在此映射中关联指定值与指定键。
            }else {
                map.put(c,1);
            }

            /* 方法二 */
            Integer value2 = map2.get(c);
            map2.put(c,value2==null?1:value2+1);
        }
        System.out.println(map);
        System.out.println(map2);
    }
}
