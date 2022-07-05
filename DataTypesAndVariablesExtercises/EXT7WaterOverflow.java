package DataTypesAndVariablesExtercises;

import java.util.Scanner;

public class EXT7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int quantities = 0;
        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (litters + quantities > 255){
                System.out.println("Insufficient capacity!");
            }else{
                quantities += litters;
            }
        }
        System.out.println(quantities);
    }
}
