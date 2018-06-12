package com.homework180526;

import java.io.*;
import java.util.*;

/**
 * Created by WangNing.
 * Date: 2018/5/28
 * Time: 20:09
 */
public class CountChars {
    public static void main(String[] args) throws Exception {
        MapCount();
    }


    public static void MapCount() throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new BufferedInputStream(
                                new FileInputStream("/wangning/src/main/java/com/homework180526/小王子.txt"))));

        String str = br.readLine();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int num = map.get(c);
                map.put(c, num + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("排序前：" + map);
        //以value进行排序
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, java.lang.Integer>>(map.entrySet());
        //重写Collections.sort方法
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println("排序后：" + list);
    }

}

