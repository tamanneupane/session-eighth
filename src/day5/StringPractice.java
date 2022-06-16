package day5;

public class StringPractice {

    public static void main(String[] args) {

//        String name = "Taman";
//        String anotherName = "Taman";
//
//        boolean equal = name == anotherName;
//
//        System.out.println(equal);

        String greeting = "Hello";
        String s = greeting.substring(0, 3);

        System.out.println(s);

        String h = "hel";

        boolean isEqual = s.equals(h);

        System.out.println(isEqual);

        boolean isEqualIgnoreCase = s.equalsIgnoreCase(h);
        System.out.println(isEqualIgnoreCase);

//        boolean isEqualIgnoreCase = s.toLowerCase().equals(h.toLowerCase());

        String s1 = "     ";

        boolean empty = s1.isEmpty();

//        boolean blank = s1.isBlank();
//
//        System.out.println("Empty = "+ empty);
//        System.out.println("Blank = " + blank);

        String email = "   Taman.neupane@gmail.com      ";
        String storeEmail = "taman.neupane@gmail.com";

        String trimmedEmail = email.trim();

        boolean isEmailSame = trimmedEmail.equalsIgnoreCase(storeEmail);

        System.out.println(isEmailSame ? "Yes email is same" : "No Email is not same");

        boolean contain = trimmedEmail.contains("Taman");

        System.out.println(contain ? "Yes string has ".concat("taman") : "No String donot have that word");

        String name = "Neupane,Taman";

        String formatterName = name.replace(","," ");

        System.out.println(formatterName);

        String a = "Taman    ";
        String b = "Taman";

        int compare = a.compareToIgnoreCase(b); // a - b

        System.out.println(String.format("Compare result = %d", compare));

        int length = a.length();

        System.out.println(length);

        String sLength = String.valueOf(length);

        String policies = "NF10000532465454456454 ; UL451110 ; 06000001";

//        String firstPolicy = policies.substring(0, 8).trim();
//        String secondPolicy = policies.substring(11, 19).trim();
//
//        System.out.println(firstPolicy);
//        System.out.println(secondPolicy);

        String[] policiesArray = policies.split(";");
        String firstPolicy = policiesArray[0].trim();
        String secondPolicy = policiesArray[1].trim();
        String thirdPolicy = policiesArray[2].trim();

        System.out.println(firstPolicy);
        System.out.println(secondPolicy);
        System.out.println(thirdPolicy);
    }
}
