package com.lin.ui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestWin1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocation(200, 200);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("Good");
        JButton button1 = new JButton("go");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("!!");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("???");
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(button1);
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.setVisible(true);
    }
}
