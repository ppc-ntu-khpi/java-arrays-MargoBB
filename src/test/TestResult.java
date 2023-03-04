package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int number = 153;
        boolean result = Exercise.isArmstrong(number);

        if (result) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
