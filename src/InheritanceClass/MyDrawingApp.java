package InheritanceClass;

class Shape {
    public Shape(String name) {
        System.out.println("Drawing Shape");
    }
}

public class MyDrawingApp extends Shape {

    public MyDrawingApp(String shapeName) {
        super(shapeName); //to instantiate parent class constructor
        System.out.println("Drawing App is ready to draw some Shape.");

    }

    public static void main(String[] args) {
        new MyDrawingApp("Ovel");

    }
}