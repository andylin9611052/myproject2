package com.lin.sales;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 =new Customer ("0001",1200);
        Customer c2 =new Customer ("0002",800);
        SilverCustomer s1 = new SilverCustomer("0001",1200);
        GoldenCustomer g1 = new GoldenCustomer("0001" , 4000);
        PlatinumCustomer p1 = new PlatinumCustomer("0001" , 6000);
        c1.print();
        c2.print();
        s1.print();
        g1.print();
        p1.print();
    }
}
