package ArraysExtersice;

import java.util.Arrays;
import java.util.Scanner;

public class EXT1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfWagon = Integer.parseInt(scanner.nextLine());
        int[] train = new int[countOfWagon];
        for (int i = 0; i < train.length ; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int wagon:train) {
            sum += wagon;
            System.out.print(wagon +" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
