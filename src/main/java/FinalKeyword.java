public class FinalKeyword {


    final class Master{
        //cannot inherit from final
    }


    class A {
        final void getMessage(){
            System.out.println("hi");
        }
    }

    class B extends A{
        //Cannot override final method
//        @Override
//        void getMessage(){
//
//        }
    }

    public static void main(String[] args){
        final int age=10;

    }
}
