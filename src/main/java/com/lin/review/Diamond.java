package com.lin.review;

public class Diamond {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j <= 3-i || j >= 3+i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j <= -1 + i || j >= 7 - i) {
                    System.out.print(" ");
                    }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
