public class MathAvg {
    public double getAvg(double a , double b)
    {
        double Avg =(a+b)/2;
        return Avg;
    }
    public static void main(String[] args) {
        MathAvg obj = new MathAvg();
        System.out.println("Average Value:" + obj.getAvg(10, 12));
    }
}

