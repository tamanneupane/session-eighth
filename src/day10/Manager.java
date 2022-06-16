package day10;

import java.time.LocalDate;

public class Manager extends Employee{

    private float bonus;

    public Manager(String name, int age, LocalDate hireDate, float salary, float bonus) {
        super(name, age, hireDate, salary);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float getSalary(){
        float totalSalary = super.getSalary() + this.bonus;
        return  totalSalary;
    }



//    public float getTotalSalary(){
//        float totalSalary = this.getSalary() + this.bonus;
//        return  totalSalary;
//    }
}
