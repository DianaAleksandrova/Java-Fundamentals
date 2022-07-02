package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PO12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("Please write an even number.");
            while (n % 2 == 0) ;
            System.out.printf("The number is: %d", Math.abs(n));
            n = Integer.parseInt(scanner.nextLine());
        }
    }
}
