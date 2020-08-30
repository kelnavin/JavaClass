package awtDemo;

import java.awt.*;

public class ButtonDemo1 extends Frame {
    public static void main(String[] args) {
        ButtonDemo1 frame= new ButtonDemo1();
        ButtonDemo btn = new ButtonDemo();

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,200);

        btn.setBounds(50,50,100,50);
        frame.add(btn);
    }


}
