package layoutdemo;
import javax.swing.border.Border;
import java.awt.*;
/*
public static final int NORTH
public static final int SOUTH
public static final int EAST
public static final int WEST
public static final int CENTER
BorderLayout:
BorderLayout()
*/

public class BorderLayoutDemo extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public BorderLayoutDemo() {

        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        setVisible(true);
        setTitle("BorderLayout Manager");
        setSize(200, 200);

        b1= new Button("1");
        b2= new Button("2");
        b3= new Button("3");
        b4= new Button("button 4");
        b5= new Button("5");
        b6= new Button("6");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.WEST);
        add(b4,BorderLayout.CENTER);
        add(b5,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}