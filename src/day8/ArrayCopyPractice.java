package day8;

import java.util.Arrays;

public class ArrayCopyPractice {

    public static void main(String[] args) {

        int[] intsOriginal = {5,6,8,10};

//        int[] intsCopy = intsOriginal;
        int[] intsCopy = Arrays.copyOf(intsOriginal,intsOriginal.length);

        intsCopy[2] = 16;

        for (int value : intsOriginal) {
            System.out.println(value);
        }

    }

}
