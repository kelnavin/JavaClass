package awtDemo;

import java.awt.*;
//through class we are creating a window

public class MyFrame extends Frame {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
        f.setSize(400,300);
        f.setTitle("My Frame");
        f.setResizable(true);// if we dont wanna RESIZE then (false)

    }
}
