package LW_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7{
    public static void main(String[] args) {

        LocalDate currentDate=LocalDate.now();
        DateTimeFormatter pattern=DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");

        String outputDate=currentDate.format(pattern);
        System.out.println(outputDate);
    }
}