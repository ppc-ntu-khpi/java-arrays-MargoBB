package domain;

public class Exercise {
    public static boolean isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return (number == sum);
    }
}
  
