public class Shape1 {
    static String name = "Draw new shape";
    String type;

    public static void main(String[] args) {
        System.out.println(name);


        Shape c = new Shape();
        Shape d = new Shape();
        c.type = ("Triangle");
        d.type = ("Oval");
        System.out.println(c.type);
        System.out.println(d.type);
    }
}

