package MethodsLab;

import java.util.Scanner;

public class PO3PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printPyramid(n);
    }
    private static void printPyramid(int n) {
        printTopHalf(n);
        printBottomHalf(n);
        }
    private static void printTopHalf(int n) {
        for (int start = 1; start < n ; start++) {
            printSingleLine(start);
        }
    }
    private static void printSingleLine(int length) {
        for (int i = 1; i <= length ; i++) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
    private static void printBottomHalf(int n) {
        for (int end = n; end >= 1 ; end--) {
            printSingleLine(end);
        }
    }
}



