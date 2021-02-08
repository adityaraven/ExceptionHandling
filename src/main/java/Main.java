import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age");
        int age = Integer.parseInt(reader.readLine());
        try {

            if(age<18 || age>26){
                throw new InvalidAgeException("Enter only age between 18 and 25");

            }
            System.out.println("Age accepted");
        }
        catch(InvalidAgeException e){
            System.out.println("Age not accepted");
            System.out.println(e.toString());
}
    }
}
