package ArraysExtersice;

import java.util.Arrays;
import java.util.Scanner;

public class EXT9KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Clone them!")){
            int[] commandInput = Arrays.stream(scanner.nextLine()
                    .split("\\s+!")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < commandInput.length; i++) {
                int currentNumber = commandInput[i];
                if (currentNumber == 1){
                    currentNumber++;
                }
            }


            command = scanner.nextLine();
        }
    }
}
