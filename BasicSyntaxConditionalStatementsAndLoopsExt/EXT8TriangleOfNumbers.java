package ExercisesBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EXT8TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n ; row++) {
            for (int i = 1; i <= row ; i++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
