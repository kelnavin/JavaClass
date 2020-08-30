package interfacedemo;

public class MyCanvas implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw new scene");
    }

    public static void main(String[] args) {
        MyCanvas canvas = new MyCanvas();
        canvas.draw();
        canvas.drawCircle();
    }
    public void drawCircle() {
        System.out.println("Drawing Red Circle");
    }

}
