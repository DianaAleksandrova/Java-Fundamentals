package ArraysExtersice;

import java.util.Scanner;

public class EXT3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] array1 = new int[n];
        int [] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);
            if ((i + 1) % 2 == 0){
                array1[i] = secondNumber;
                array2[i] = firstNumber;
            }else{
                array1[i] = firstNumber;
                array2[i] = secondNumber;
            }
        }
        for (int number : array1) {
            System.out.print(number + " ");
        }
        System.out.println();
        for ( int number : array2) {
            System.out.print(number + " ");
        }
    }
}
