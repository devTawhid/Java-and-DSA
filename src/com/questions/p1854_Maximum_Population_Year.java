package com.questions;

import java.util.Arrays;

public class p1854_Maximum_Population_Year {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{1998,2010}};
//        maximumPopulation_bf(logs);
        maximumPopulation(logs);

    }
    static int maximumPopulation_bf(int[][] logs) {
        int[] years = new int[101];

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                years[j - 1950]++;
            }
        }

        int maxVal = 0;
        int maxYear = 0;
        for (int i = 0; i < years.length; i++) {
            if(maxVal < years[i]){
                maxVal = years[i];
                maxYear = 1950 + i;
            }
        }
        return maxYear;
    }

    static int maximumPopulation(int[][] logs) {
        int[] years = new int[101];

        for (int i = 0; i < logs.length; i++) {
            years[logs[i][0] - 1950]++;
            years[logs[i][1] - 1950]--;
        }
        for (int i = 1; i < years.length; i++) {
            years[i] += years[i - 1];
        }
//        System.out.println(Arrays.toString(years));
        int maxVal = 0;
        int maxYear = 0;
        for (int i = 0; i < years.length; i++) {
            if(maxVal < years[i]){
                maxVal = years[i];
                maxYear = 1950 + i;
            }
        }
        return maxYear;
    }
}
