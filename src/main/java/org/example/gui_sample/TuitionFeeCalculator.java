package org.example.gui_sample;

import javax.swing.*;

public class TuitionFeeCalculator {

    public static double calculateTuition(double tuition, int units, boolean hasLab, boolean isScholar){
        double total = tuition * units;

        //Has Laboratory
        if(hasLab){
            total += 1500;
        }
        if(isScholar){
            double discount = total * 0.20;
            total -= discount;
        }
        return total;
    }

    public static void main(String[] args) {
        double tuition = Double.parseDouble(JOptionPane.showInputDialog("Enter Tuition"));
        int units = Integer.parseInt(JOptionPane.showInputDialog("Enter the units"));
        int hasLabResponse = JOptionPane.showConfirmDialog(null, "Has lab subjecs");
        int isScholarResponse = JOptionPane.showConfirmDialog(null, "Are you scholar?");

        boolean hasLab = (hasLabResponse == JOptionPane.YES_OPTION);
        boolean isScholar = (isScholarResponse == JOptionPane.YES_OPTION);

        double res = calculateTuition(tuition, units, hasLab, isScholar);
        JOptionPane.showMessageDialog(null, "Your final tuition " + res);

    }
}
