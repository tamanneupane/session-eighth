package day9;

import java.util.Arrays;

public class CommandLineParameter {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));
        if(args.length > 0){
            String mode = args[0];
            switch (mode.toLowerCase()){
                case "development":
                    //URl
                    //DATABASE
                    break;
                case "staging":
                    //URl
                    //DATABASE
                    break;
                case "release":
                    //URl
                    //DATABASE
                    break;
                default:
                    mode = "development";
                    //URl
                    //DATABASE
                    break;
            }
        }else{
            String mode = "development";
            //URl
            //DATABASE
        }



    }
}
