package day7;

import java.util.Scanner;

public class ControlFlowExamples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter target for today:");
        int target = scanner.nextInt();

        System.out.println("Enter sales for today:");
        int sales = scanner.nextInt();

        // First only single condition
//        if(sales >= target){
//            System.out.println("Satisfactory");
//            System.out.println("Receive Bonus");
//        }

        //Two conditions
//        if(sales >= target){
//            System.out.println("Satisfactory");
//            System.out.println("Receive Bonus");
//        }else{
//            System.out.println("Poor");
//            System.out.println("No Bonus");
//        }

        //More than two conditions
        if(sales >= target * 2){
            System.out.println("Excellent");
            System.out.println("Receive Bonus");
        }else if(sales >= target * 1.5){
            System.out.println("Fine");
            System.out.println("Receive Bonus");
        }else if(sales >= target){
            System.out.println("Satisfactory");
            System.out.println("Receive Bonus");
        }else{
            System.out.println("You are fired");
        }

        System.out.println("Program Completed");




//        if(sales >= target * 1.5 && sales < target * 2){
//            System.out.println("Fine");
//            System.out.println("Receive Bonus");
//        }
//
//        if(sales >= target && sales < target * 1.5){
//            System.out.println("Satisfactory");
//            System.out.println("Receive Bonus");
//        }
//
//        if(sales < target){
//            System.out.println("You are fired");
//        }
    }
}
