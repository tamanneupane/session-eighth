package day4;

import java.time.LocalDate;
import java.util.Objects;

//Model, POJO
public class Employee {

    private int id; // mand
    private String name; // mand
    private String salary; // mand
    private LocalDate hireDate; // mand

    private Address address; //Optional

    private Employee(){} // Default Constructor

    //parameterized Constructor
    public Employee(int id,String name, String salary, LocalDate hireDate){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());
    }

    public Employee(int id,String name, String salary, LocalDate hireDate, Address address){
        this(id, name, salary, hireDate);
        this.address = address;
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
