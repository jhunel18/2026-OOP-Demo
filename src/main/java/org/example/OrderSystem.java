package org.example;

import javax.swing.*;
import java.util.Scanner;

public class OrderSystem {
    public static double calculateTotal(double price, int quantity, boolean isMember) {

        double total = price * quantity;

        // discount for bulk orders
        if (quantity > 10) {
            double discount = total * 0.10;
            total = total - discount;
        }

        // member discount
        if (isMember) {
            double membershipDiscount = total * 0.05;
            total = total - membershipDiscount;
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
        int resp = JOptionPane.showConfirmDialog(null, "Do you have lab subject?");
        int userResponse = JOptionPane.showConfirmDialog(null, "Are you a member?");
        boolean hasSubject = (resp == JOptionPane.YES_OPTION);
        boolean isMember = (userResponse == JOptionPane.YES_OPTION);

        double res = calculateTotal(price, qty, isMember);
        JOptionPane.showMessageDialog(null, "Your final payment " + res);

    }
}
