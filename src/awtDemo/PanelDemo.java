package awtDemo;

import java.awt.*;

public class PanelDemo extends Panel {
    static Button btn1, btn2,btn3;

    public static void main(String[] args) {
        Frame f= new Frame("Panel Demo");
        f.setLayout(null);
        PanelDemo panel =new PanelDemo();
        panel.setBackground(Color.MAGENTA);
        panel.setBounds(50,50,300,100);

        btn1 =new Button("Button 1");
        btn2 =new Button("Button 2");
        btn3 =new Button("Button 3");

        panel.setLayout(new FlowLayout());
        panel.add(btn1);
        panel.add(btn2);

        PanelDemo p2= new PanelDemo();
        p2.setBackground(Color.CYAN);
        p2.setBounds(50,200,300,100);
        p2.setLayout(new FlowLayout());
        p2.add(btn3);

        f.setVisible(true);
        f.setSize(400,500);
        f.setLocation(100,100);
        f.add(panel);
        f.add(p2);
    }
}
