package day10;

import java.time.LocalDate;

public class Employee {

    private String name;
    private int age;
    private LocalDate hireDate;
    private float salary;

    public Employee(String name, int age, LocalDate hireDate, float salary) {
        this.name = name;
        this.age = age;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
