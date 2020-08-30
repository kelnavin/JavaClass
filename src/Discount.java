public class Discount {
    public void getDiscount(double amount) {
        double discount = (amount * 10) / 100;
        System.out.println("Discount Amount:" + discount);
    }

    public static void main(String[] args) {

        Discount obj = new Discount();
        obj.getDiscount(1000);
    }
}
