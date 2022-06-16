package day7;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String today = scanner.nextLine();



//        if(today.equals("Sunday")){
//            System.out.println("A");
//        }else if(today.equals("Monday")){
//            System.out.println("B");
//        }else if(today.equals("Tuesday")){
//            System.out.println("A");
//        }else if(today.equals("Wednesday")){
//            System.out.println("C");
//        }else if(today.equals("Thursday")){
//            System.out.println("B");
//        }else if(today.equals("Friday")){
//            System.out.println("D");
//        }else {
//            System.out.println("E");
//        }

        // New way
//        switch (today.toLowerCase()) {
//            case "sunday", "tuesday" -> System.out.println("A");
//            case "monday", "thursday" -> System.out.println("B");
//            case "wednesday" -> System.out.println("C");
//            case "friday" -> System.out.println("D");
//            case "saturday" -> System.out.println("E");
//            default -> System.out.println("This is not any day");
//        }

        // Old way
        switch (today.toLowerCase()){
            case "sunday" :
            case "tuesday":
                System.out.println("A");
                break;
            case "monday":
            case "thursday":
                System.out.println("B");
                break;
            case "wednesday":
                System.out.println("C");
                break;
            case "friday":
                System.out.println("D");
                break;
            case "saturday":
                System.out.println("E");
                break;
            default:
                System.out.println("This is not any day");
                break;
        }





    }
}
