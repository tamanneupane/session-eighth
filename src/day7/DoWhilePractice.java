package day7;

import java.util.Scanner;

public class DoWhilePractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int years = 20;
        int balance = 15000;

        int payment = 2000;

        String answer = "";
        do{
            balance += payment;
            years++;
            System.out.println("Do you want to continue your job? (Y/N)");
            answer = scanner.next();
        }while (answer.equalsIgnoreCase("y"));

        System.out.println(years);
        System.out.println(balance);
    }
}
