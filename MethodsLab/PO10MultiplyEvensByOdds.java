package MethodsLab;

import java.util.Scanner;

public class PO10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int multiply = getMultipleOfEvensAndOdds(Math.abs(n));
        System.out.print(multiply);
    }
    private static int getMultipleOfEvensAndOdds(int number) {
        int evensSum = getSumOfEvensDigit(number);
        int oddsSum = getSumOfOddDigit(number);
        return  evensSum * oddsSum;
    }
    private static int getSumOfEvensDigit(int number) {
        int evensSum = 0;
        while (number > 0){
            int digit = number % 10;
            if (digit % 2 == 0){
                evensSum += digit;
            }
            number = number / 10;
        }
        return evensSum;
    }
    private static int getSumOfOddDigit(int number) {
        int oddsSum = 0;
        while (number > 0){
            int digit = number % 10;
            if (digit % 2 == 1){
                oddsSum += digit;
            }
            number = number / 10;
        }
        return oddsSum;
    }
}
