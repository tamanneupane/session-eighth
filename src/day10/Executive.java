package day10;

import java.time.LocalDate;

public final class Executive extends Manager{

    public Executive(String name, int age, LocalDate hireDate, float salary, float bonus) {
        super(name, age, hireDate, salary, bonus);
    }

    public void fireManager(){

    }
}
