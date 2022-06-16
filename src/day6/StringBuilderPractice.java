package day6;

public class StringBuilderPractice {

    public static void main(String[] args) {

        String welcome = "Welcome !" + " to " +" Java Class";
        System.out.println(welcome);

        StringBuilder builder = new StringBuilder();
        builder.append("Welcome! ");
        builder.append("to ");
        builder.append("Java Class.");

        String welcome1 = builder.toString();

        System.out.println(welcome1);

    }
}
