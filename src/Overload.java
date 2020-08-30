public class Overload {
    void sum() // 1 sum
    {
        System.out.println("SUM");
    }

    double sum(double n) // 2 sum
    {
        return n;
    }

    void sum(int a, int b) // 3 sum
    {
        System.out.println("SUM:" + (a + b));
    }

    public static void main(String[] args) {
        Overload m = new Overload();
        //m.sum(); ---1
        //m.sum(5,16);
        // m.sum(10,5);
        {
            System.out.println(m.sum(10.5));
        }
    }
}
