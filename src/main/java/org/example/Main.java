package org.example;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name + ");
        JOptionPane.showMessageDialog(null, "Happy Valentine's " + name);
    }
}

