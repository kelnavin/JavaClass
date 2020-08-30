public class Math {
    public double getAvg(double a, double b) {
        double avg = (a + b) / 2;
        return avg;
    }

    public static void main(String[] args) {
        Math obj = new Math();
        System.out.println("Average Value:" + obj.getAvg(5, 6));
    }

}

