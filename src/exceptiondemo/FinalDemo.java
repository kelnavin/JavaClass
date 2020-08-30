package exceptiondemo;
/*try{
        //Statement;
        }catch(Exception Type 1 obj){
        //Statement;
        }catch(Exception Type2 obj){
        //Statment;
        }finally{
    //Statement
        }
 */
public class FinalDemo {
    public static void main(String[] args){
        try {
            int age[] = {10, 20, 30, 40};
            System.out.println(20/2);
            System.out.println(age[50]);
        }catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }finally{
            System.out.println("HELLO WORLD");// even the upper statement fails this one will print

        }
    }
}
