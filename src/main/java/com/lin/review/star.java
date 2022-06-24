package com.lin.review;

public class star {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (2-i>=j || 4+i<=j) {
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
