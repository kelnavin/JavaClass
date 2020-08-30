package layoutdemo;

import java.awt.*;

public class ContactApp extends Frame {
    Panel panelHeader, panelFooter, panelSideBar, panelContent;
    Label lblAppName, lblcopyright;

    Button btn1, btn2, btn3;

    public ContactApp(){
        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);
        setVisible(true);
        setTitle("Contact App");
        setSize(500,400);

        panelHeader=new Panel();
        panelHeader.setBackground(Color.CYAN);
        lblAppName=new Label("Contact Application");
        panelHeader.setLayout(new FlowLayout());
        panelHeader.add(lblAppName);

        panelContent= new Panel();
        panelContent.setBackground(Color.LIGHT_GRAY);

        panelSideBar=new Panel();
        panelSideBar.setBackground(Color.MAGENTA);
        btn1=new Button("Create New");
        btn2=new Button("Update");
        btn3=new Button("Delete");
        panelSideBar.setLayout(null);
        panelSideBar.setSize(150,300);
        panelSideBar.add(btn1);
        btn1.setBounds(10,20, 100,30);
        panelSideBar.add(btn2);
        btn2.setBounds(10,70, 100,30);
        panelSideBar.add(btn3);
        btn3.setBounds(10,120, 100,30);

        panelFooter= new Panel();
        panelFooter.setBackground(Color.white);
        panelFooter.setLayout(new FlowLayout());

        lblcopyright= new Label("Copyright 2020, All Rights are Reserved.");
        panelFooter.add(lblcopyright);

        add(panelHeader,BorderLayout.NORTH);
        add(panelContent,BorderLayout.CENTER);
        add(panelSideBar,BorderLayout.WEST);
        add(panelFooter,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new ContactApp();
    }
}
