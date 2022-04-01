package com.lin.sales;

public class PlatinumCustomer extends Customer{
    public PlatinumCustomer(String id, int amount) {
        super(id, amount);
        off = 0.7f;
    }
    public void print() {
        float platinumoff = 0.2f;
        System.out.println(id + "\t" + amount + "\t" + (amount*off) + "(" + amount*platinumoff + ")");;
    }
}
