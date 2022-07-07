package ArraysExtersice;

import java.util.Arrays;
import java.util.Scanner;

public class EXT7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int length = 1;
        int maxLength = 0;
        int digit = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int currentElement = array[i];
            int nextElement = array[i + 1];
            if (currentElement == nextElement) {
                length++;
                if (length > maxLength){
                    maxLength = length;
                    digit = currentElement;
                }
            }else{
                length= 1;
            }
        }
        for (int i = 0; i < maxLength; i++) {
            System.out.print(digit + " ");
        }
    }
}