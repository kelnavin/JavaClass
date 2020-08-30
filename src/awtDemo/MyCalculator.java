package awtDemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends Frame implements ActionListener {
    TextField textField1, textField2, textField3;
    Button btnpls, btnexit;
    Label lbln1, lbln2, lbl3;

    public MyCalculator(String title) {
        super(title);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300, 200);

        lbln1 = new Label("First Number:");
        lbln2 = new Label("Second Number:");
        lbl3 = new Label("Result:");

        textField1 = new TextField(20);
        textField2 = new TextField(20);
        textField3 = new TextField(20);

        btnpls = new Button(" + ");
        btnexit = new Button("Exit");

        add(lbln1);
        add(textField1);
        add(lbln2);
        add(textField2);
        add(lbl3);
        add(textField3);

        btnpls.addActionListener(this);
        add(btnpls);

        add(btnexit);
        btnexit.addActionListener(this);
    }

    public static void main(String[] args) {
        new MyCalculator("My Calculator");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnpls) {
            double n1 = Double.parseDouble(textField1.getText()); //Double.parseDouble converts string to double
            double n2 = Double.parseDouble(textField2.getText());

            double sum = n1 + n2;
            textField3.setText(String.valueOf(sum)); //String.valueOf() converts numeric to string
        }
        if (e.getSource() == btnexit) {
            System.exit(0);
        }
    }
}

