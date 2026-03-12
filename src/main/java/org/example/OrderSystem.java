package org.example;

import javax.swing.*;
import java.util.Scanner;

public class OrderSystem {
    public static double calculateTotal(double price, int quantity, boolean isMember) {

        double total = price * quantity;

        // discount for bulk orders
        if (quantity > 10) {
            total = total * 0.9;
        }

        // member discount
        if (isMember) {
            total = total * 0.95;
        }

        // shipping fee
        if (total < 500) {
            total = total + 50;
        }

        return total;
    }

    public static void main(String[] args) {
        int price = Integer.parseInt(JOptionPane.showInputDialog("Enter the price"));
        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity"));
        int userResponse = JOptionPane.showConfirmDialog(null, "Are you a member?");
        boolean isMember = (userResponse == JOptionPane.YES_OPTION);

        double res = calculateTotal(price, qty, isMember);
        JOptionPane.showMessageDialog(null, "Your final payment " + res);

    }
}
