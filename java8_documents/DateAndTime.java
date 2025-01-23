package java8_documents;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour = time.getHour();
        int minut= time.getMinute();
        int sec = time.getSecond();
        System.out.println(hour+minut+sec);
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();

        System.out.println("dd "+dd+" mm " +mm+" yy "+yy);
    }
}
