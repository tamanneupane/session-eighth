package day9;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        int[] ints = {5,2,1,6,4};

        int[] intsCopy = Arrays.copyOf(ints, ints.length);
        Arrays.sort(intsCopy);

        System.out.println(Arrays.toString(intsCopy));
        System.out.println(Arrays.toString(ints));
    }
}
