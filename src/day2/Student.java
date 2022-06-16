package day2;

public class Student extends Person {

    public Student() {
    }

//    public Student(String rollNumber) {
//        this.rollNumber = rollNumber;
//    }

    private String rollNumber;

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
