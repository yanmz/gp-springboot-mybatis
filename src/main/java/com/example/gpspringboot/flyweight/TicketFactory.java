package com.example.gpspringboot.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {

    private static Map<String,ITicket> ticketMap = new ConcurrentHashMap<>();


    public static  ITicket queryTicket(String from,String end){
        String key = from+"-->"+end;
        if(ticketMap.containsKey(key)){
            System.out.println("使用缓存找："+key);
           return ticketMap.get(key);
        }
        System.out.println("新创建："+key);
        TrainTicket trainTicket = new TrainTicket(from, end);
        ticketMap.put(key,trainTicket);
        return  trainTicket;
    }
}
