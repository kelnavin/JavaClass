package layoutdemo;

import java.awt.*;
/*
FlowLayoutManager:
FlowLayout()

 */

public class FlowLayoutDemo extends Frame {
    Button b1,b2,b3,b4,b5,b6;
    public FlowLayoutDemo(){
        FlowLayout flowLayout = new FlowLayout(10);

        setLayout(flowLayout);
        setVisible(true);
        setTitle("FlowLayout Manager");
        setSize(200,200);

        b1= new Button("1");
        b2= new Button("2");
        b3= new Button("3");
        b4= new Button("4");
        b5= new Button("5");
        b6= new Button("6");

        add(b1);add(b2);add(b3);add(b4);add(b5); add(b6);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
