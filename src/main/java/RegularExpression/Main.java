//package RegularExpression;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        String str = "ab";
//
//
//        System.out.println("cccc".matches("[abc]"));
//        System.out.println("cccc".matches("[abc]*"));
//        System.out.println(str.matches("[abc]*"));
//        System.out.println("Adi123".matches("[a-zA-z]*"));
//        System.out.println("Adi123".matches("[a-zA-z0-9]*"));
//        System.out.println("cccf".matches("[abc]"));
//        System.out.println("cccA".matches("[a-z]"));
//        System.out.println("cccA".matches("[a-zA-Z]"));
//
//        System.out.println("cccA".matches("[^a-z]"));
//        System.out.println("cccg".matches("[a-z]+"));
//
//        System.out.println("malayalam".matches("[a-zA-Z]"));
//        System.out.println("m".matches("[a-zA-Z]"));
//        System.out.println("#$%^&^&".matches("[a-zA-Z]"));
//
//        String phone = "9873135733";
//        System.out.println(phone.matches("[0-9]{10}"));
//
//        System.out.println(phone.matches("[987]{2}[0-9]{8}"));
//
//        System.out.println(phone.matches("987[0-9]{7}"));
//        System.out.println("6203135633".matches("^987{10}"));
//
//        System.out.println("a1aaaaa@".matches("[A-Z]*"));
//        System.out.println("aa1AA#".matches("[a-zA-Z]*"));
//
//        System.out.println("aa1AArrr".matches("[0-9a-zA-Z]{6,20}"));
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter password");
//        String password=reader.readLine();
//
//        if(password.matches(".{6,20}")){
//            if(password.matches("[0-9]+")){
//                if(password.matches("[a-z]+") && password.matches("[A-Z]+")){
//                    if(password.matches("[!@#$%]+")){
//                        System.out.println("valid Password");
//                    }
//                }
//            }
//        }
//        else{
//            System.out.println("invalid password");
//        }
//
//    }
//}
