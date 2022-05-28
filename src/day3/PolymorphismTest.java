package day3;

public class PolymorphismTest {

    public static void main(String[] args) {
        float add1 = add(2,5);
        System.out.println(add1);
        double add2 = add(2f, 3f);
        System.out.println(add2);
        double add3 = add(2.0, 3.0);
        System.out.println(add3);
    }

    public static int add(int a, int b){
        int temp = a + b;
        return temp;
    }

    public static double add(double a, double b){
        double temp = a + b;
        return temp;
    }
}
