package com.lin.review;

import java.util.Scanner;

public class Vending2 {
    public static void main(String[] args) {
        int [] price = {15,17,19,21,25};
        for (int i = 0; i< price.length; i++) {
            System.out.println(price[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        while (!end) {
            System.out.println("coin: 1/5/10");
            String s = scanner.next();
            switch (s) {
                case "1":
                case "5":
                case "10":
                    int num = Integer.parseInt(s);
                    total = total + num;
                    System.out.println("total: "+total);
                    break;
                case "0":
                    end = true;
                    System.out.println("final total : "+total);
                    System.out.println("10X: "+ total/10 +" 5X: " + (total - (total/10)*10)/5 + " 1X: " + total%5);
                    break;
                case "a":
                case "b":
                case "c":
                case "d":
                case "e":
                    int index = s.charAt(0)-97;
                    if (total >= price[index]) {
                        System.out.println("Don!");
                        total = total - price[index];
                        System.out.println("total: "+ total);
                    }
                    else {
                        System.out.println("Beep!");
                        System.out.println("total: "+ total);
                    }
                    break;
                default:
                    System.out.println("Wrong!");
                    break;
            }
        }
    }

}
