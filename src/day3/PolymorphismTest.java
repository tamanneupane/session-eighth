package day3;

public class PolymorphismTest {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        float add1 = add(x,y);
        System.out.println(add1);
        double add2 = add(2f, 3f);
        System.out.println(add2);
        double add3 = add((float) 2.0, (float) 3.0);
        System.out.println(add3);
    }

    public static int add(int a, int b){
        int temp = a + b;
        return temp;
    }

    public static double add(float a, float b){
        double temp = a + b;
        return temp;
    }
}
