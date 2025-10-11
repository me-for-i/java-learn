package com.market;

public class Goods {
    String id;
    String name = "g";
    int count;
    double purchasePrice;
    double soldPrice;
    boolean soldOut;

    double getProfit() {
        return soldPrice - purchasePrice;
    }

    void describe() {
        System.out.println(name + " 进价：" + purchasePrice + "； 售价：" + soldPrice);
    }
}
