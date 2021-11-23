package ru.vsu.cs.volobueva;

public class Tests {
    public TestResult tests() {
        ListOfValuesForTests arraysList = new ListOfValuesForTests();
        TestCase[] arrays = arraysList.getTests();

        for (int i = 0; i < arrays.length; i++) {
            int newSum = CalculateSum.calculate(arrays[i].getArray());

            if (newSum != arrays[i].getSumResult()) {
                System.out.print(i + 1);
                TestResult.printComment();
                return new TestResult(false);
            }
        }
        return new TestResult(true);
    }
}
