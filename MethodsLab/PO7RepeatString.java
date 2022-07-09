package MethodsLab;

import java.util.Scanner;

public class PO7RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = Integer.parseInt(scanner.nextLine());
        System.out.println(getRepeatString(input,counter));
    }
    private static String getRepeatString(String input, int counter) {
        String result = "";
        for (int i = 0; i < counter; i++) {
            result += input;
        }
        return result;
    }
}



