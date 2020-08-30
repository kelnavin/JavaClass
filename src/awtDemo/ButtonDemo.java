package awtDemo;

import java.awt.*;// all library
//import java.Button.*;

/*
constructor
==>Button()
==>Button(String button name s)
Useful methods:-
setText(String s)
setSize(String x,y)

adding components into window(Frame):
frameObject.add(Component c);


 */
public class ButtonDemo extends Frame {
    public static void main(String[] args) {
        ButtonDemo f = new ButtonDemo();
        Button btn = new Button("Click Me !");
        Button btn1 = new Button("Hello World"); // adding new Button

//adding Layout for Arranging components Automatically Left to Right
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400,300);
        f.setTitle("My App");
//        btn.setBounds(100,100,120,25);
        f.add(btn); //adding component object
        f.add(btn1);
    }
}
