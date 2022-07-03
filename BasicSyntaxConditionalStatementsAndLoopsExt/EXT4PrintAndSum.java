package ExercisesBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EXT4PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int number = startNumber; number <= endNumber ; number++) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
