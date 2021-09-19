package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        long average = 0L;
        int count = 0;

        while (true) {
            boolean hasAnInt = scanner.hasNextInt();
            if (hasAnInt) {
                number = scanner.nextInt();
                sum = sum + number;
                count = count + 1;
                average = Math.round((double) sum / count);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average );
        scanner.close();
    }
}
