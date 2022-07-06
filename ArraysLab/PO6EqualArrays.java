package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PO6EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e)).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e)).toArray();
        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < secondArray.length; i++) {
            sum += secondArray[i];
            if (firstArray[i] != secondArray[i]){
                flag = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }
        }
        if (flag){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
