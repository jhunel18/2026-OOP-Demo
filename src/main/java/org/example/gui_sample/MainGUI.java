package org.example.gui_sample;

import javax.swing.*;
import java.awt.*;

public class MainGUI {
    public static void main(String[] args) {
        int attempts = 0;
        String code;

        JFrame frame = new JFrame("First GUI");
        frame.setSize(800, 500);

        JLabel label = new JLabel("Welcome to World of Programming");
        Font f = new Font("Arial", Font.BOLD, 120);
        label.setFont(f);

        while(true){
            code = JOptionPane.showInputDialog("Enter the code : ");
            if(!code.equals("0001")){

                JOptionPane.showMessageDialog(null, "Please Try again!");
                attempts +=1;
                if(attempts >=3){
                    JOptionPane.showMessageDialog(null, "Maximum Attempts");
                    break;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Welcome User");
                label.setVisible(true);
                frame.add(label);
                frame.setVisible(true);
                break;
            }
        }

    }
}

