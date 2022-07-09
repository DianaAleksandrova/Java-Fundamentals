package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PO8MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(getMathPower(number,power)));
    }
    private static double getMathPower(double number, double power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
       return result;
    }

}
