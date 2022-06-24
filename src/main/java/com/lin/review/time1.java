package com.lin.review;

public class time1 {
    public static void main(String[] args) {
        for( int i = 1 ; i<= 9 ; i++){
            for( int a= 2 ; a <= 5 ; a++){
                System.out.printf(a+" X "+ i +" = " +"");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("\n");
        for( int i = 1; i<= 9; i++){
            for( int a = 6 ; a<= 9; a++){
                System.out.printf("%d X %d = %02d ", a, i, a*i);
            }
            System.out.printf("\n");
        }
    }

}
