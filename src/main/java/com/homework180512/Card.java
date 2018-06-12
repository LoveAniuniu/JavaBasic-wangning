package com.homework180512;

import java.util.Objects;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 18:21
 */
public class Card {
    public static final int HEART = 0;   //红心
    public static final int SPADE = 1;   //黑桃
    public static final int CLUB = 2;     //梅花
    public static final int DIAMOND = 3;   //方块
    public static final int JOKER = 4;    //大小王花色

    public static final int THREE = 0;
    public static final int FOUR = 1;
    public static final int FIVE = 2;
    public static final int SIX = 3;
    public static final int SEVEN = 4;
    public static final int EIGHT = 5;
    public static final int NINE = 6;
    public static final int TEN = 7;
    public static final int JACk = 8;
    public static final int QUEEN = 9;
    public static final int KING = 10;
    public static final int ACE = 11;
    public static final int TWO = 12;
    public static final int BIGGER = 13;
    public static final int LITTLE = 14;

    private int suit;//花色 红桃、黑桃、梅花、方块、大王、小王
    private int rank;//点数、大小

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card() {
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private static String[] suit_name=
            {"红桃","黑桃","梅花","方块",""};

    private static String[] rank_name =
            {"3","4","5","6","7","8","9","10","J","Q","K","A",
                    "2","小王","大王"};

    @Override
    public String toString() {
        return suit_name[suit]+rank_name[rank];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit &&
                rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}
