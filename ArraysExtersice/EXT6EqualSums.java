package ArraysExtersice;

import java.util.Arrays;
import java.util.Scanner;

public class EXT6EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e)).toArray();
        boolean flag = false;
        for (int index = 0; index <= numbers.length - 1 ; index++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int indexLeft = 0; indexLeft <= index - 1 ; indexLeft++) {
                sumLeft += numbers[indexLeft];
            }
            for (int indexRight = index + 1; indexRight <= numbers.length - 1 ; indexRight++) {
                sumRight += numbers[indexRight];
            }
            if (sumLeft == sumRight){
                System.out.print(index);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("no");
        }
    }
}
