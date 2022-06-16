package day7;

public class BlockScopePractice {

    private static int i = 10;

    public static void main(String[] args) {
        System.out.println(i);
        int j = 11;
        {
            System.out.println(i);
            System.out.println(j);
            int k = 12;
        }

//        System.out.println(k);
    }

//    public static void test(){
//        System.out.println(i);
//    }

    // j cannot be used here
}
