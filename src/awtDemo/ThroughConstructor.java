package awtDemo;

import java.awt.*;

public class ThroughConstructor extends Frame {
    public ThroughConstructor(String title) {
        super(title);
        setVisible(true);
        setSize(400, 400);
        setResizable(true);
    }

    public static void main(String[] args) {
        new ThroughConstructor("My New Window");
    }
}
