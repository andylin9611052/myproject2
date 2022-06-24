package com.lin.review;

import java.util.Random;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        System.out.println("secret: "+secret);
        System.out.println("Please enter from 1 to 100 :");
        int max = 100;
        int min = 1;
        for (int i = 0; i<=4; i++){
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num < secret) {
                System.out.println("Please enter a number from "+num +" to "+max +" (You still have "+(5-(i+1))+" times)");
                min = num;
            }
            else if (num > secret) {
                System.out.println("Please enter a number from "+min +"to" +num +" (You still have "+(5-(1+i))+" times)");
                max = num;
            }
            else {
                System.out.println("Bingo");
                break;
            }
            if (i==4) {
                System.out.println(" You loose,the secret number is: " +secret);
                break;
            }

        }

    }
}