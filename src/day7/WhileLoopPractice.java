package day7;

public class WhileLoopPractice {

    public static void main(String[] args) {
        int goal = 10000;

        int years = 20;
        int balance = 0;

        int payment = 20;

        while (balance <= goal) {
//          int payment = 2000;
            balance += payment;
            years += 1;
            if(years == 100) break;
        }

        System.out.println(years);

    }

}
