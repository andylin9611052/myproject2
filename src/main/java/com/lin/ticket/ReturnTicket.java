package com.lin.ticket;

public class ReturnTicket extends Ticket{
    float discount = 0.9f;
    public ReturnTicket(Station start, Station destination) {
        super(start, destination);
        price = (int) (price*2*discount);
    }
}
