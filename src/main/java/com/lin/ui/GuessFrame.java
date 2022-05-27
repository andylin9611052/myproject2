package com.lin.ui;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    Random random = new Random();
    int secret = random.nextInt(100)+1;
    public GuessFrame() {
        super();
        System.out.println("enter a number 1-100");
        System.out.println("sercret: " + secret);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("Guess!");
        JLabel label = new JLabel("zzz...");
        JTextField number = new JTextField(8);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);

                if(num > secret) {
                    label.setText("smaller");
                }
                if(num < secret) {
                    label.setText("bigger");
                }
                if(num == secret) {
                    label.setText("bingo");
                }
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);

    }








    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setSize(600,400);
        //guessFrame.setVisible(true);
    }
}
