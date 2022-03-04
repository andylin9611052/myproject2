package com.lin;

public class scoringNG {
    public static void main(String[] args) {
        String[] names = {"Jack", "Benny", "Timmy", "Jane", "Jenny"};
        int [] maths ={80,70,60,50,40};
        int [] englishs = {90,80,70,70,50,};
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t" + maths[i] + "\t" + englishs[i] +"\t"+ (maths[i] + englishs[i])/2);
        }
    }
}