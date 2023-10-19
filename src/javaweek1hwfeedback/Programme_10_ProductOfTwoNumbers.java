package javaweek1hwfeedback;
/**
 * 10. Write a Java program that takes two numbers as input and display the
 * product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output : 25 x 5 = 125
 */
public class Programme_10_ProductOfTwoNumbers {
    public static void main(String[] args) {
        //First Number declaration
        int firstNum = 25;
        //Second Number declaration
        int secondNum = 5;
        int produced = firstNum * secondNum;
        //Expected output
        System.out.println(firstNum + " x " + secondNum + " = " + produced);
    }
}
