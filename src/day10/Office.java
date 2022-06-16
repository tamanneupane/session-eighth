package day10;

import java.time.LocalDate;

public class Office {

    public static void main(String[] args) {
//        Employee employee = new Employee("ABC", 28, LocalDate.now(), 5000);
//        System.out.println(employee.getName());
//        System.out.println(employee.getSalary());
//
//        Manager manager = new Manager("DEF", 28, LocalDate.now(), 8000, 1000);
//        System.out.println(manager.getName());
//        System.out.println(manager.getSalary());
//
//        Manager executive = new Manager("EXE", 28, LocalDate.now(), 10000, 2000);
//        executive.getName();

        //PolyMorphism
        Employee employee = new Employee("ABC", 28, LocalDate.now(), 5000);
        Employee manager = new Manager("DEF", 28, LocalDate.now(), 8000, 1000);
        System.out.println(employee.getSalary());
        System.out.println(manager.getSalary());
    }
}
