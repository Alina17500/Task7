package ru.vsu.cs.volobueva;

public class TestResult {
    final boolean testResult;

    public TestResult(boolean testResult) {
        this.testResult = testResult;
    }

    public boolean getTestResult() {
        return testResult;
    }

    static void printComment() {
        System.out.println(" test is incorrect.");
        System.out.println("The answer calculated by the program doesn't coincide the correct one " +
                "and, accordingly, doesn't satisfy the condition of the task. ");
        System.out.println("Please read the task requirements again and try again.");
    }
}
