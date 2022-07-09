package MethodsLab;

import java.util.Scanner;

public class PO4Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        lineAdd(command,number1,number2);
        lineMultiply(command,number1,number2);
        lineSubtract(command,number1,number2);
        lineDivide(command,number1,number2);
    }
    private static void lineAdd(String command, int number1, int number2) {
        if (command.equals("add")){
            System.out.print(number1 + number2);
        }
    }
    private static void lineMultiply(String command, int number1, int number2) {
        if (command.equals("multiply")){
            System.out.print(number1 * number2);
        }
    }
    private static void lineSubtract(String command, int number1, int number2) {
        if (command.equals("subtract")){
            System.out.print(number1 - number2);
        }
    }
    private static void lineDivide(String command, int number1, int number2) {
        if (command.equals("divide")){
            System.out.print(number1 / number2);
        }
    }
}
