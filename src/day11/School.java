package day11;



public class School {

    public static void main(String[] args) {

        Employee employee = new Employee("ABC", 30);
        employee.printDescription();
        employee.getFullName();

        System.out.println(employee.toString());

        Student student = new Student("DEF", 30);
        student.printDescription();
        student.getFullName();

    }
}
