package com.lin.review;

public class starsquare {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}