package ru.vsu.cs.volobueva;

public class TestCase {
    final int[] array;
    final int sumResult;

    public TestCase(int[] array, int sumResult) {
        this.array = array;
        this.sumResult = sumResult;
    }

    public int[] getArray() {
        return array;
    }

    public int getSumResult() {
        return sumResult;
    }
}
