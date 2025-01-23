package test;

import java.time.LocalDate;
import java.time.LocalTime;

public class dateAndTime {
    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now();
        LocalTime localtime  = LocalTime.now();

        System.out.println(localtime);
        System.out.println(localdate);
    }
}
