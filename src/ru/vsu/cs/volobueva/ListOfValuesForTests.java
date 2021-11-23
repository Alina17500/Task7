package ru.vsu.cs.volobueva;

public class ListOfValuesForTests {
    public TestCase[] getTests() {
        TestCase array1 = new TestCase(new int[]{0, 2, 5, 21, 4, 7}, 6);
        TestCase array2 = new TestCase(new int[]{44, 54, 7, 6, 8, 151, 14, 2, 100}, 28);
        TestCase array3 = new TestCase(new int[]{-11, 2, -3, -10, 38, -2, 6}, 30);
        TestCase array4 = new TestCase(new int[]{1, 1, 0, 1, 0, 4, 10}, 0);
        TestCase array5 = new TestCase(new int[]{666, 4, 56, 8, 21, 99, 81, 10}, 0);
        TestCase array6 = new TestCase(new int[]{8, 71, 3, 44, 6, 41, 98, 0}, 148);
        TestCase array7 = new TestCase(new int[]{17, 88, 356, 21, 32, 4}, 0);
        TestCase array8 = new TestCase(new int[]{0, 54, 0, 44, 666, 96, 99}, 54);
        TestCase array9 = new TestCase(new int[]{-9, -29, -50, -15, -4, -97}, -54);
        TestCase array10 = new TestCase(new int[]{-8, -27, 55, -2, 3, 90, 0, -651, 9, 6}, 90);

        return new TestCase[]{array1, array2, array3, array4, array5, array6, array7, array8, array9, array10};
    }
}