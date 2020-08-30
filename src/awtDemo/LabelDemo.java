package awtDemo;

import java.awt.*;
/*
Label()
label(String s)
 */
public class LabelDemo extends Frame {

    public static void main(String[] args) {
        LabelDemo f= new LabelDemo();
        Button btn= new Button("Let's Get Stated");
        Button btn2 = new Button("ERROR");// MY ADD
        Label lbl = new Label("Hello Java Programmer !!");

        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(400,200);
        f.setTitle("Label Demo");
        f.add(lbl);
        f.add(btn);
        f.add(btn2);
    }
}
