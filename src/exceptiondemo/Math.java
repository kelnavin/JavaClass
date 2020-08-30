package exceptiondemo;
/*
 * Methods to handling exceptions
 * 1. try catch block
 * syntax:
 * try{
 * //statements;
 * }
 * catch(ExceptionType obj){
 * // statements;
 * }
 * super class (Exception) of all other sub exceptions class.
 * 2. multi try catch
 * 3. finally
 * 4.throws
 * 5.throw
 * */
// Try catch:-

public class Math {
    public static void main(String[] args) {
        try {
            int x = 50;
            int y = 0;
            System.out.println(x / y);
        }catch (Exception e){
            System.err.println("Number cannot be Divided by / 0 (zero)");
            System.err.println(e);
        }
    }
}