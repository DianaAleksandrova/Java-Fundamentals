package ArraysLab;

import java.util.Scanner;

public class PO4ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length / 2; i++) {
            String oldInput = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = oldInput;
        }
        System.out.println(String.join(" ",input));
    }
}
