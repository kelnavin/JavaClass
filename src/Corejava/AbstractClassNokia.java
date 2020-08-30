package Corejava;

public class AbstractClassNokia extends AbstractClassMobile {
    String color;

    public static void main(String[] args) {
        AbstractClassNokia nokiaxl = new AbstractClassNokia();
        nokiaxl.name = "NokiaXL";
        nokiaxl.color = "Black";
        nokiaxl.price = "17000";

        System.out.println("BrandName:" + nokiaxl.name + "\nColor:" + nokiaxl.color + "\nPrice:" + nokiaxl.price +"rs");

    }
}
