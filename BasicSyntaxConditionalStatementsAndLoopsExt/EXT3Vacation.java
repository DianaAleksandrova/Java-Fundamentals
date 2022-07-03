package ExercisesBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EXT3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String rooms = scanner.nextLine();
        String days = scanner.nextLine();
        double sum = 0;
        double discount = 0;
        if (rooms.equals("Students")) {
            if (days.equals("Friday")) {
                sum = people * 8.45;
            } else if (days.equals("Saturday")) {
                sum = people * 9.8;
            } else if (days.equals("Sunday")) {
                sum = people * 10.46;
            }
        } else if (rooms.equals("Business")) {
            if (days.equals("Friday")) {
                sum = people * 10.9;
                discount = (people - 10) * 10.9;
            } else if (days.equals("Saturday")) {
                sum = people * 15.6;
                discount = (people - 10) * 15.6;
            } else if (days.equals("Sunday")) {
                sum = people * 16.0;
                discount = (people - 10) * 16.0;
            }
        } else if (rooms.equals("Regular")) {
            if (days.equals("Friday")) {
                sum = people * 15.0;
            } else if (days.equals("Saturday")) {
                sum = people * 20.0;
            } else if (days.equals("Sunday")) {
                sum = people * 22.5;
            }
        }
        if (rooms.equals("Students") && people >= 30){
            sum *= 0.85;
        }else if (rooms.equals("Business") && people >= 100){
            sum = discount;
        }else if (rooms.equals("Regular") && people >= 10 && people <= 20){
            sum *= 0.95;
        }
        System.out.printf("Total price: %.2f",sum);
    }
}