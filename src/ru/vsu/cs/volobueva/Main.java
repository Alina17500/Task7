package ru.vsu.cs.volobueva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tests test = new Tests();
        TestResult testResult = test.tests();

        if (testResult.getTestResult()) {
            System.out.println("The program is correct");

            int[] array = new int[readNumberOfElements()];
            readArray(array);

            int sumResult = CalculateSum.calculate(array);
            printAnswer(sumResult);
        } else System.out.println("The tests failed. The program doesn't work correctly, the program cannot be used.");
    }

    static int readNumberOfElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The entered data is incorrect. number > 0. Read the condition again and try again.");
            number = readNumberOfElements();
        }
        return number;
    }
    static void readArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array elements:");

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + " element = ");
            array[i] = scanner.nextInt();
        }
    }

    static void printAnswer(int sumResult) {
        System.out.print("sum = " + sumResult);
    }
}
