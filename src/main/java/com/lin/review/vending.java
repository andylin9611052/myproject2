package com.lin.review;

import java.util.Scanner;

public class vending {
    public static void main(String[] args) {
        System.out.println("A drink 17 dollar");
        System.out.println("B drink 21 dollar");
        System.out.println("Please press the buttom a or b ");
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        int total = 0;
        int aprice =17;
        int bprice =21;
        while (!end) {
            System.out.println("put the coin 1/5/10");
            String s = scanner.next();
            try {
            int num =Integer.parseInt(s);
            switch (num) {
                case 1:
                case 5:
                case 10:
                    total = total + num;
                    System.out.println("total: " + total);
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    break;

            }
            }
            catch (NumberFormatException e) {
                if (s.equals("a")){
                    System.out.println("A drink");
                    if (total < aprice) {
                        System.out.println("need to put " + (aprice - total)+ " dollar");
                    }
                    if (total >= aprice) {
                        total = total - aprice;
                        System.out.println("take your item");
                    }

                }
                if (s.equals("b")) {
                    System.out.println("B drink");
                    if (total < bprice) {
                        System.out.println("need to put " + (bprice - total) + " dollar");
                    }
                    if (total >= bprice) {
                        total = total - bprice;
                        System.out.println("take your item");
                    }
                    }
                }
            }
        System.out.println("Bye");
        }
    }
