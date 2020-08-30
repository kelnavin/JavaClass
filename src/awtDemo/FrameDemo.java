package awtDemo;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setTitle("My Frame");
        frame.setResizable(true);
    }
}
