package Corejava;

public class AbsMethodNokia extends AbsMethodMobile{
    String color;

    public void info() {
        System.out.println("showing nokia information");
    }

    public static void main(String[] args) {
        AbstractClassNokia nokiaxl = new AbstractClassNokia();
        nokiaxl.name = "NokiaXL";
        nokiaxl.color = "Black";
        nokiaxl.price = "17000";

        System.out.println("BrandName:" + nokiaxl.name + "\nColor:" + nokiaxl.color + "\nPrice:" + nokiaxl.price + "rs");
        System.out.println("Showing NokioXL Information");
        //nokiaxl.info();
    }
}

