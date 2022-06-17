package com.lin.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            int data = fileReader.read();
            System.out.println(data);
            data = fileReader.read();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("wrong file");
        } catch (IOException e) {
            System.out.println("wrong data");
        }
        System.out.println("Testing");
    }
}
