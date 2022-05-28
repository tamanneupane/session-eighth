package day4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class PredefindeDatePractice {

    public static void main(String[] args) {

        Date today = new Date();
        System.out.println(today);

//        Date date = new Date(2022, 5,28);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Calendar now = Calendar.getInstance();
        System.out.println(now);

        Calendar dob = Calendar.getInstance();
        dob.set(Calendar.YEAR, 1993);
        dob.set(Calendar.MONTH, 7);
        dob.set(Calendar.DAY_OF_MONTH, 22);

        System.out.println(dob);

        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss");
        String formattedDate = sdf.format(dob.getTime());
        System.out.println(formattedDate);
    }
}
