package com.lin.ticket;

public class ElderTicket  extends Ticket{
    float discount = 0.5f;
    public ElderTicket(Station start, Station destination) {
        super(start, destination);
        price = (int)(price*discount);
    }
}
