package MethodsLab;

import java.util.Scanner;

public class PO11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int mathOperation = getMathOperation(firstNumber,operator,secondNumber);
        System.out.println(mathOperation);
    }
    private static int getMathOperation(int firstNumber, String operator, int secondNumber) {
        int result = 0;
        switch (operator){
            case "/":
                result = firstNumber  / secondNumber;
                break;
            case"*":
                result = firstNumber * secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
        }
        return result;
    }
}
