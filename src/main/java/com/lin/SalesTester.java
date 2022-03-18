package com.lin;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 =new Customer ("0001",1200);
        Customer c2 =new Customer ("0002",800);
        SilverCustomer s1 = new SilverCustomer("0001",1200);
        c1.print();
        c2.print();
        s1.print();
    }
}
