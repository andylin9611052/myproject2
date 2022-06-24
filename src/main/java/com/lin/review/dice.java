package com.lin.review;
import java.util.Random;
public class dice {
    public static void main(String[] args)
    {
        int[] count = new int[6];
        for ( int i = 0; i < 10; i++ ) {
            Random random = new Random();
            int point = random.nextInt(6)+1;
            count[point-1]++;
            System.out.println(point);
        }
        System.out.println();
        for ( int y = 0; y < 6; y++ ) {
            System.out.println(y+1+"appear"+count[y]+"times");
        }
    }
}

