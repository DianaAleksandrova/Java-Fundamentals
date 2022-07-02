package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PO9SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            int oddSum = 2 * i - 1;
            System.out.println(oddSum);
            sum += oddSum;
        }
        System.out.printf("Sum: %d",sum);
        }
    }
