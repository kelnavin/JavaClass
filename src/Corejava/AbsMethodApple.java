package Corejava;

public class AbsMethodApple extends AbsMethodMobile{
    public void info() {
        System.out.println("Showing Apple Information");
    }

    public static void main(String[] args) {
        AbsMethodApple iphone5 = new AbsMethodApple();
        iphone5.info();
    }
}
