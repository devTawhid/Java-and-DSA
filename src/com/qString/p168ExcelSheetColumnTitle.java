package com.qString;

public class p168ExcelSheetColumnTitle {
    public static void main(String[] args) {
        // recording the current time
        long start = System.nanoTime();

        // code is running here;
        convertToTitle(701);

        // calculating the time elapsed
        long end = System.nanoTime() - start;
        int seconds = (int) (end / 1000000000);
        int milliseconds = (int) (end / 1000000) % 1000;
        int nanoseconds = (int) (end % 1000000);
        System.out.printf("sec: %d milsec:%d nanosec:%d \n", seconds, milliseconds, nanoseconds);

    }
    static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        int i = columnNumber;
        while (i != 0) {
            char ch = (char)((i - 1) % 26 + 65);
            i = (i - 1) / 26;
            str.append(ch);
        }
        return str.reverse().toString();
    }
}
