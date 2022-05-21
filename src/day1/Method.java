package day1;

public class Method {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

//        int c = a + b;
//        System.out.println(c);
        add(a, b);

        int d = 5;
        int e = 5;

//        int f = d + e ;
//        System.out.println(f);
        add(d,e);

        int g = 10;
        int h = 20;

//        int i = g + h;
//        System.out.println(i);
        add(g,h);
    }

    public static void add(int a, int b) {
       int temp = a + b;
       System.out.println(temp);
    }
}
