package ru.vsu.cs.volobueva;

public class CalculateSum {
    public static int calculate(int[] array) {
        int number;
        int firstSimplePosition = -1;
        int sum = 0;
        int sumResult = 0;

        for (int i = 0; i < array.length; i++) {
            number = array[i];

            if (firstSimplePosition < 0) {
                if (determiningSimplicityOfNumber(number)) {
                    firstSimplePosition = i;
                }
            } else {
                if (determiningSimplicityOfNumber(number)) {
                    sumResult = sum;
                }
                if (number % 2 == 0) {
                    sum += array[i];
                }
            }
        }
        return sumResult;
    }

    static boolean determiningSimplicityOfNumber(int number) {
        int sum = 0;
        for (int i = 2; i < Math.abs(number); i++) {
            if (number % i == 0) {
                sum++;
            }
        }
        return sum == 0 || number == 0;
    }
}