package day4;

import java.time.LocalDate;
import java.util.Objects;

//Model, POJO
public class Employee {

    private int id; // mandatory
    private String name; // mand
    private float salary; // mand
    private LocalDate hireDate; // mand

    private Address address; //Optional

    public static float salaryPercent = 0.1f;

//    public Employee(){} // Default Constructor


    //parameterized Constructor
    public Employee(int id,String name, float salary, LocalDate hireDate){
        this.id = id;
        this.name = name;
        this.salary = salary;
//        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());
    }

    public Employee(int id,String name, float salary, LocalDate hireDate, Address address){
        this(id, name, salary, hireDate);
        this.address = address;
    }

    // this = employee1 || employee2
    public void increaseSalary(){
        float increasedSalary = this.salary + this.salary * salaryPercent;
        this.salary = increasedSalary;
    }

    public static float getSalaryPercent(){
        return salaryPercent;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", hireDate=" + hireDate.toString() +
                ", address=" + address +
                '}';
    }


}
