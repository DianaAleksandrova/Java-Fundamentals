package ArraysExtersice;

import java.util.Arrays;
import java.util.Scanner;

public class EXT5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e)).toArray();

        for (int index = 0; index <= input.length - 1; index++) {
            int number = input[index];
            if (index == input.length - 1){
                System.out.print(number);
                break;
            }
            boolean flag = false;
            for (int i = index + 1; i <=input.length - 1 ; i++) {
                if (number > input[i]){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(number + " ");
            }
        }
    }
}
