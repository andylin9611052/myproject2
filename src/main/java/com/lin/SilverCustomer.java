package com.lin;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id,int amount) {super(id,amount);}
    public float returnMoney(){return (amount/1000*off)*1000;}

    @Override
    public void print(){
        System.out.println(id + "\t" + amount + "\t" +(amount - offMoney()) + "(" +returnMoney()+ ")");
    }
}