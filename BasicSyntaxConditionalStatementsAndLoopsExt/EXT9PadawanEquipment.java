package ExercisesBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EXT9PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceOfSaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());
        double sumSabres = priceOfSaber * Math.ceil(countStudents + countStudents * 0.1);
        double sumRobes = priceOfRobes * countStudents;
        double sumBelts = priceOfBelts * (countStudents - countStudents  / 6);
        double sum = sumRobes + sumSabres + sumBelts;
        if (amountOfMoney >= sum){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        }else{
            double neededMoney = sum - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }
    }
}
