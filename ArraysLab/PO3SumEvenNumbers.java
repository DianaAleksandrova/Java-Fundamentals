package ArraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PO3SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();
        int sumEven = 0;
        for (int number : arr){
            if (number % 2 == 0){
                 sumEven += number;
            }
        }
        System.out.println(sumEven);
    }
}