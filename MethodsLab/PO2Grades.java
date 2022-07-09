package MethodsLab;

import java.util.Scanner;

public class PO2Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        gradeInWords(grade);
    }
    private static void gradeInWords(double grade) {
        if (grade >= 2 && grade <3){
            System.out.print("Fail");
        }else if (grade >=3 && grade < 3.5){
            System.out.print("Poor");
        }else if (grade >= 3.5 && grade < 4.5){
            System.out.print("Good");
        }else if (grade >= 4.5 && grade < 5.5){
            System.out.print("Very good");
        }else if (grade >= 5.5 && grade <= 6){
            System.out.print("Excellent");
        }
    }
}
