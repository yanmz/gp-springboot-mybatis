package com.example.gpspringboot.flyweight;

import sun.security.krb5.internal.Ticket;

public class TicketTest {
    public static void main(String[] args) {
        ITicket ticket  = TicketFactory.queryTicket("上海","长沙");
        ticket.shouInfo("硬卧");
        ITicket ticket1  = TicketFactory.queryTicket("上海","长沙");
        ticket1.shouInfo("软卧");

    }
}
