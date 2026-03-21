package org.example.array_examples;

import java.util.List;

public class DailyProductionCount {

    public static int getTotal(int[] num){
        int total = 0;
        for(int n : num){
           total += n;
        }
        return total;
    }

    public static int getHighest(int[] num){
        int highest = num[0];
        for(int n: num){
            if (n > highest) {
                highest = n;
            }
        }
        return highest;
    }

    public static int getLowest(int[] num){
        int lowest = num[0];
        for(int n: num){
            if (n > lowest) {
                lowest = n;
            }
        }
        return lowest;
    }
}
