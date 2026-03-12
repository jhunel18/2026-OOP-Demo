package org.example.gui_sample;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int attempts = 0;
        String code;

        JFrame frame = new JFrame("First GUI");
        frame.setSize(600, 400);

        JLabel label = new JLabel("Welcome to World of Programming");
        label.setSize(80, 40);

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

