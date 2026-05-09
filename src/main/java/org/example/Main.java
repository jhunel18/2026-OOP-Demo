package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("My Label");
        frame.add(label);
        //JFrame frame = new JFrame("Frame with Label");
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
