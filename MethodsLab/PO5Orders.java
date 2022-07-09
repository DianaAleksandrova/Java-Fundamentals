package MethodsLab;

import java.util.Scanner;

public class PO5Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        lineOrders(product,quantity);
    }
    private static void lineOrders(String product, int quantity) {
        double price = 0;
        if (product.equals("coffee")){
             price = quantity * 1.5;
        }else if (product.equals("water")){
            price = quantity * 1.0;
        }else if (product.equals("coke")){
            price = quantity * 1.4;
        }else if (product.equals("snacks")){
            price = quantity * 2.0;
        }
        System.out.printf("%.2f",price);
    }
}
