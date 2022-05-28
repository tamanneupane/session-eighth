package day4;

import java.time.LocalDate;

public class Office {


    public static void main(String[] args) {

//        Employee employee1 = new Employee();

        Employee employee1 = new Employee(1,"ABC", "20000", null);
        System.out.println(employee1);

        Employee employee2 = new Employee(2,"Taman", "2000", null);
        System.out.println(employee2);

//        Address address = new Address("Bagmati", "Aananda Bhumi", "Bhaktapur");
//        Employee employee3 = new Employee(2,"ABC", "3000", LocalDate.of(2019, 1, 1), address);

    }
}
