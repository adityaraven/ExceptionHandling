package RExpressionQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static public boolean validatePassword(String password1){
        if(password1.matches(".{6,20}")){
            if(password1.matches(".*[0-9].*+")){
                if(password1.matches(".*[a-z].*+") && password1.matches("[A-Z]+")){
                    if(password1.matches(".*[!@#$%].*+")){

                        return true;
                    }
                }
            }
        }

            return false;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter password");
        String password1 =reader.readLine();
        if(validatePassword(password1)){
            System.out.println("valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
}
