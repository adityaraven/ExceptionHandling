package date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Enter the date format dd/mm/yyyy");
        String dateString = reader.readLine();
        SimpleDateFormat sdf =new SimpleDateFormat("dd/mm/yyyy");

        try{

            //String  to date
            Date parseDate =sdf.parse(dateString);
            System.out.println(parseDate);

            //date to string
            String formatString = sdf.format(parseDate);
            System.out.println(formatString);

        }
        catch(ParseException e){
            System.out.println("Enter only dd/mm/yyyy pattern");
        }
        finally{

        }
    }
}
