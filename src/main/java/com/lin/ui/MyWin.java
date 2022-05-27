package com.lin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        JFrame frame  = new JFrame();
        //big or small
        frame.setSize(600,400);
        //locate
        frame.setLocation(300,200);
        //close the frame --> end
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //add Component
        JButton button = new JButton("OK!");
        //Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hahaha");
            }
        });
               //MyActionListener listener = new MyActionListener();
               //button.addActionListener(listener);
                frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(new Button("Testing"));
        frame.setVisible(true);

        System.out.println("END?");
    }
}
