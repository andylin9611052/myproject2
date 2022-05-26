package com.lin.ui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestWin {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocation(300,200);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("Push!");
        JButton button1 = new JButton("Pushhhhh!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(button1);
        frame.add(new JButton("test1"));
        frame.add(new JButton("test2"));
        frame.setVisible(true);
    }
}
