package DateEgTwo;

import javax.swing.text.DateFormatter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the date format dd/MM/yyyy");
        String dateString = reader.readLine();

        LocalDate anyDate =LocalDate.parse(dateString,dateTimeFormatter);
        System.out.println(anyDate);
        System.out.println(LocalDate.now());
        long npOfDays =  ChronoUnit.DAYS.between(anyDate,LocalDate.now());
        long npOfMonths =  ChronoUnit.MONTHS.between(anyDate,LocalDate.now());

        LocalDate plus = LocalDate.now().plusDays(10);
        LocalDate plus1 = LocalDate.now().minusDays(10);

        System.out.println("Number of Days -->" + npOfDays);
        System.out.println("Number of Months-->" + npOfMonths);
    }
}
