/* Example Switch Case */

public class Operator {
    public static void main(String [] args) {
        int a = 10, b = 5;
        /* operator "plus" */
        char op = '+';
            switch (op) {
                case '+':
                    System.out.println("Sum:" + (a + b));
                    break;
                case '-':
                    System.out.println("Difference:" + (a - b));
                    break;
                default:
                    System.out.println("INVALID Op   ");
                    break;


            }
        }
    }