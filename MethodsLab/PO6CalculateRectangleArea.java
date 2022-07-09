package MethodsLab;

import java.util.Scanner;

public class PO6CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wight =  Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int area = getRectangleArea(wight, height);
        System.out.println(area);
    }
    private static int getRectangleArea(int wight, int height) {
        return wight * height;
    }
}