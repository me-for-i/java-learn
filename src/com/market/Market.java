package com.market;

public class Market {

    public static void main(String[] args) {
        Goods g1 = new Goods();
        g1.id = "1";
        g1.name = "g1";
        g1.describe();

        Goods g2 = new Goods();
        g2.describe();
    }
}
