package com.example.gpspringboot.flyweight;

import java.util.Random;

public class TrainTicket implements ITicket {
    private String from;
    private String end;
    private int price;

    public TrainTicket(String from, String end) {
        this.from = from;
        this.end = end;
    }

    @Override
    public void shouInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(String.format("%s-->%s:%s价格：%s元",this.from,this.end,bunk,this.price));
    }
}
