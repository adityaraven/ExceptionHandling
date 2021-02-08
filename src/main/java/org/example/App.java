package org.example;

import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {




        try{
            int b=10;
            int a=b/0;
             System.out.println(a);

        }

        catch (ArithmeticException ex){
            System.out.println("Divide by zero is not possible");
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("Code works fine");
        }

        try{
            int[] number ={100,300,200,600,700};
            System.out.println(number[7]);
        }
        catch (ArrayIndexOutOfBoundsException ex){

            System.out.println(ex);
            System.out.println(ex.getClass());
            System.out.println(ex.getClass().getSimpleName());
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("Code works fine");
        }

        try{
            String string =null;
            System.out.println(string.toLowerCase(Locale.ROOT));
        }

        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("Code works fine");
        }

//        catch(Exception ex){
//            System.out.println("Divide by zero is not possible");
//            System.out.println(ex.getMessage());
//        }

        System.out.println("Over Logic ...");
    }
}
