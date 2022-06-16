package day6;

import java.io.Console;
import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        Console cons = System.console();

//        System.out.println("Enter Username : ");
//        String userName = scanner.nextLine();
//
//        System.out.println("Enter password : ");
//        String password = scanner.nextLine();

//        String passwordStr = String.valueOf(password);

//        System.out.println(passwordStr);

        System.out.println("Enter name of student : ");
        String name = scanner.nextLine();

        System.out.println("Enter marks of science : ");
        float scienceMark = scanner.nextFloat();

        System.out.println("Enter marks of maths : ");
        float mathsMark = scanner.nextFloat();

        System.out.println("Enter marks of english : ");
        float englishMark = scanner.nextFloat();

        System.out.println("Enter marks of social : ");
        float socialMark = scanner.nextFloat();

        System.out.println("Enter marks of computer : ");
        float computerMark = scanner.nextFloat();

        float grandTotal = scienceMark + mathsMark + englishMark + socialMark + computerMark;

        String grandTotalMessage = String.format("The grand total of %s is %.2f",name, grandTotal);
        System.out.println(grandTotalMessage);

        float percentage = grandTotal/5;
        String percentageMessage = String.format("Your total percentage is %.2f", percentage);
        System.out.println(percentageMessage);

        if(percentage >= 80)
            System.out.println("Distinction");
        else if(percentage >= 70)
            System.out.println("First Division");
        else if(percentage >= 60){
            System.out.println("Second Division");
        }else if(percentage >= 40){
            System.out.println("Third Division");
            System.out.println("You need to work hard");
        }else{
            System.out.println("Failed");
        }
    }
}
