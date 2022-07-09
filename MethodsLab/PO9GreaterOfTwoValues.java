package MethodsLab;

import java.util.Scanner;

public class PO9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String text = scanner.nextLine();
       String firstNumber = scanner.nextLine();
       String secondNumber = scanner.nextLine();
       switch (text){
           case "int":
               System.out.println(getMax(Integer.parseInt(firstNumber),Integer.parseInt(secondNumber)));
               break;
           case "char":
               System.out.println(getMax((firstNumber).charAt(0),(secondNumber).charAt(0)));
               break;
           case "string":
               System.out.println(getMax(firstNumber,secondNumber));
               break;
       }
    }
    private static int getMax(int firstNumber, int secondNumber) {
        return Math.max(firstNumber,secondNumber);
    }
    private static char getMax(char firstNumber, char secondNumber) {
        if (firstNumber >= secondNumber){
            return firstNumber;
        }
        return secondNumber;
    }
    private static Object getMax(String firstNumber, String secondNumber) {
        if (firstNumber.compareTo (secondNumber) >= 0){
            return firstNumber;
        }
        return secondNumber;
    }
}
