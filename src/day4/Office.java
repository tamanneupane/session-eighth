package day4;

import register.User;

public class Office {


    public static void main(String[] args) {

        User  user = new User();

//        Employee employee3 = new Employee();

        // 2000 + 2000 * 10/100;

        Employee employee1 = new Employee(1,"ABC", 20000f, null);
        System.out.println(employee1);

        Employee employee2 = new Employee(2,"Taman", 2000f, null, new Address("1", "ABC Chowk", "Kathmandu"));
        System.out.println(employee2);


        System.out.println("==============================================================");

//        float salary = employee1.getSalary() + employee1.getSalary() * 0.1f;
//        System.out.println(salary);
//
//        employee1.setSalary(salary);

        employee1.increaseSalary();

        System.out.println(employee1);

        employee2.increaseSalary();

        System.out.println(employee2);


//        Address address = new Address("Bagmati", "Aananda Bhumi", "Bhaktapur");
//        Employee employee3 = new Employee(2,"ABC", "3000", LocalDate.of(2019, 1, 1), address);

        // Static Example

//        System.out.println(Employee.salaryPercent);
//        System.out.println(Employee.salaryPercent);

        Employee.salaryPercent = 0.2f;

        System.out.println(Employee.salaryPercent);
        System.out.println(Employee.salaryPercent);

       Employee.getSalaryPercent();
    }


}
