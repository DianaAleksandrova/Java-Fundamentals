package ArraysExtersice;

import java.util.Arrays;
import java.util.Scanner;

public class EXT8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            for (int j = i + 1; j <numbers.length ; j++) {
                if (i == j){
                    continue;
                }
                int number2 = numbers[j];
                if (number + number2 == sum){
                    System.out.printf("%d %d%n",number,number2);
                }
            }
        }
    }
}
