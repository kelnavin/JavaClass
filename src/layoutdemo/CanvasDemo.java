package layoutdemo;

import java.awt.*;
/*
public class Canvas extends Component implements Accessible
-> public void paint(Graphics g)
  {
    //code
  }
  java.awt.Graphics class provides many methods for graphics programming.
Commonly used methods of Graphics class:
public abstract void drawString(String str, int x, int y): is used to draw the specified string.
public void drawRect(int x, int y, int width, int height): draws a rectangle with the specified width and height.
public abstract void fillRect(int x, int y, int width, int height): is used to fill rectangle with the default color and specified width and height.
public abstract void drawOval(int x, int y, int width, int height): is used to draw oval with the specified width and height.
public abstract void fillOval(int x, int y, int width, int height): is used to fill oval with the default color and specified width and height.
public abstract void drawLine(int x1, int y1, int x2, int y2): is used to draw line between the points(x1, y1) and (x2, y2).
public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer): is used draw the specified image.
public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used draw a circular or elliptical arc.
public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
public abstract void setColor(Color c): is used to set the graphics current color to the specified color.
public abstract void setFont(Font font): is used to set the graphics current font to the specified font.
 */
public class CanvasDemo extends Canvas {
    int x[]= {100,150,120,50,10};
    int y[]= {50,100,150,150,100};

    public CanvasDemo(){
        setSize(400,800);
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(800,400);
        frame.setVisible(true);
        frame.add(new CanvasDemo());
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(75,75,150,75);

        g.setColor(Color.GREEN);
        g.fillRect(300,100,100,100);

        g.drawLine(75,250,200,250);
        g.fillPolygon(x,y,5);

        g.drawString("Hello",100,300);
    }
}
