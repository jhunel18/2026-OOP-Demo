package org.example.array_examples;

public class DailyProductionCountTest {
    public static void main(String[] args) {
        int[] production = {120, 90, 80, 100, 150};

        System.out.println("The total " + DailyProductionCount.getTotal(production));
        System.out.println("The highest " + DailyProductionCount.getHighest(production));
        System.out.println("The lowest " + DailyProductionCount.getLowest(production));

    }
}
