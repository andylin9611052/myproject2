package com.lin.review;

public class Square {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            for (int j=0;j<20;j++) {
                if (i==1||i==8||j==1||j==18) {
                    if (i==0||i==9||j==0||j==19) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
