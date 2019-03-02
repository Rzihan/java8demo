package com.pzh.example.lambda;

import javax.swing.*;

/**
 * @author Pan梓涵
 * @date 2019/2/24 10:07
 */
public class SwingTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("My JButton");
        jButton.addActionListener(event -> System.out.println("Button Pressed!"));
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
