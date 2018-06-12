package com.homework180512;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by WangNing.
 * Date: 2018/5/18
 * Time: 10:42
 */
public class CardList{

    public void  shuffle(){
         /*创建一副牌*/
        List<Card> cards = new ArrayList<Card>();
        for (int i=Card.THREE;i<=Card.TWO;i++){
            cards.add(new Card(Card.HEART,i));
            cards.add(new Card(Card.SPADE,i));
            cards.add(new Card(Card.CLUB,i));
            cards.add(new Card(Card.DIAMOND,i));
        }
        cards.add(new Card(Card.JOKER,Card.BIGGER));
        cards.add(new Card(Card.JOKER,Card.LITTLE));
//        System.out.println(cards);

        /*洗牌：从前往后 依次 拿一张牌 和 后面的 随机一张牌 调换位置*/
        System.out.println("-----------开始洗牌---------------");
        Random random = new Random();
        Integer it = cards.size();
//        System.out.println(cards);
        for(int i=0;i<it;i++){

            /*方法一 可以正常实现*/
            int r = random.nextInt(it);
            System.out.println("===========循环次数："+i+"==============");
            Card seq = cards.get(i);    //顺序取出集合中的第i个元素
            System.out.print("seq==="+seq+";  ");
            Card ran =cards.get(r);  //随机取出集合中的一个元素
            System.out.println("ran==="+ran);
            System.out.println(cards); //打印出Card调换位置前的顺序
            cards.remove(ran);  //移除随机取出的元素
            cards.add(i,ran);   //把随机取出的元素 放到 第i位
            cards.remove(seq);  //移除顺序取出的元素
            cards.add(r,seq);   //把顺序取出的元素 放到随机取出元素所在的位置
            System.out.println(cards);  //打印出Card调换位置后的顺序


            /*方法二  未实现，没有交换位置*/
//            int r = random.nextInt(it);
//            System.out.println("===========循环次数："+i+"==============");
//            Card seq = cards.get(i);    //顺序取出集合中的第i个元素
//            System.out.print("seq==="+seq+";  ");
//            Card ran =cards.get(r);  //随机取出集合中的一个元素
//            System.out.println("ran==="+ran);
//            System.out.println(cards); //打印出Card调换位置前的顺序
//            Card temp =null;
//            temp = seq;
//            seq = ran;
//            ran = temp;
//            System.out.println(cards);  //打印出Card调换位置后的顺序

        }
//        System.out.println(cards);
        System.out.println("-----------洗牌结束---------------");
    }
}
