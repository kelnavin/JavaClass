package exceptiondemo;

public class MultiTryCatchDemo {
    public static void main(String[] args) {
        try {
//       eg.1)
//       System.out.println(20/0);
//        }catch(ArithmeticException e){
//            System.err.println("Number can't be divided by zero");
//            System.err.println(e);

//            eg.2)
//            int age[] = {10, 20, 30, 40};
//            System.out.println(age[5]);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.err.println("Array size out of bounds");
//            System.err.println(ex);

//            eg.3)
            int age[]={10,20,30};
            System.out.println(20/2);// need to pass to move to another statement
            System.out.println(age[2]);//need to pass to move to another print statement
            System.out.println("Hello World");
        }catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.err.println(e);

        }

    }
}