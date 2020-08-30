package awtDemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Menubar:
Menubar();
menubarobj.add(Menu item);

setMenubar();

Menu:
Menu();
menu(String s);

MenuItem:
menuItem();
MenuItem(Strings)
 */
public class MenuBarDemo extends Frame implements ActionListener {
    MenuItem mi1;
    public MenuBarDemo(String title){
        super(title);
        MenuBar mb= new MenuBar();
        setMenuBar(mb);
        Menu m1 = new Menu("File");
        mi1 = new MenuItem("New");
        MenuItem mi2= new MenuItem("Open");

        setSize(400,300);
        setVisible(true);

        mb.add(m1);
        m1.add(mi1);
        mi1.addActionListener(this);
        m1.add(mi2);
    }

    public static void main(String[] args) {
        new MenuBarDemo("MenuBar Example");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mi1){
            System.out.println("menuitem is clicked.");
        }
    }
}