package exceptiondemo;

public class Divide {
    public static void main(String[] args) {
        int x= 50;
        int y = 0;
        System.out.println(x/y);
        // THEN ERROR: Exception in thread "main" java.lang.ArithmeticException:
        // by zero at exceptiondemo.Divide.main(Divide.java:7)
    }
}
