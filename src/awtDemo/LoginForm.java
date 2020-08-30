package awtdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends Frame implements ActionListener{
    Panel mypanel;
    Button btnlogin,btnclear,btnexit;
    Label lbluser,lblpass;
    TextField txtuser,txtpassword;

    public LoginForm(String title){
        super(title);
        setVisible(true);
        setSize(340, 200);
        setLayout(null);

        mypanel=new Panel();
        mypanel.setBackground(Color.GRAY);
        mypanel.setLayout(null);
        mypanel.setBounds(0,0,340,200);

        lbluser=new Label("Username:");
        lblpass=new Label("Password:");

        txtuser=new TextField(20);
        txtpassword=new TextField(20);

        btnlogin=new Button("Login");
        btnclear=new Button("Clear");
        btnexit=new Button("Exit");

        mypanel.add(lbluser);
        lbluser.setBounds(20,50,100,30);
        mypanel.add(txtuser);
        txtuser.setBounds(140,50,160,30);

        mypanel.add(lblpass);
        lblpass.setBounds(20,100,100,30);
        mypanel.add(txtpassword);
        txtpassword.setBounds(140,100,160,30);

        mypanel.add(btnlogin);
        btnlogin.addActionListener(this);
        btnlogin.setBounds(50,150,60,25);
        mypanel.add(btnclear);
        btnclear.addActionListener(this);
        btnclear.setBounds(120,150,60, 25);
        mypanel.add(btnexit);
        btnexit.addActionListener(this);
        btnexit.setBounds(200,150,60,25);

        add(mypanel);
    }

    public static void main(String[] args) {
        new LoginForm("User Login");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnexit){
            System.exit(0);
        }
        if(e.getSource()==btnclear){
            txtuser.setText("");
            txtpassword.setText("");
        }
        if(e.getSource()==btnlogin){
            String user=txtuser.getText();
            String password=txtpassword.getText();
            if(user.equalsIgnoreCase("admin") && password.equals("a123") ){
                System.out.println("welcome");
            }else{
                System.out.println("Invalid username or password");
            }
        }
    }
}