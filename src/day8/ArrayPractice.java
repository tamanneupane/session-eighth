package day8;

import day2.Student;

public class ArrayPractice {

    public static void main(String[] args) {
//        int[] a = {2,10,5};
        int[] a = new int[3];

        a[0] = 2;
        a[1]= 10;
        a[2] = 5;


        int dataAt2Index = a[2];

        System.out.println(dataAt2Index);

        System.out.println(a);

        for (int i = 0; i < a.length; i++){
            int index = i;
            System.out.println(a[i]);
        }

        //Enhanced For Loop
        for(int value : a){
            System.out.println(value);
        }

//        a[3] = 9;

//        Student[] students = {new Student(), new Student()};
        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        Student students1 = students[1];

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}
