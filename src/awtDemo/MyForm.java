package awtDemo;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
TextField:
TextField()
TextField(String s)
TextField(Int x),- for Size
TextField('String s",int x means Size-default length)
==Useful Methods
getText()
setText()
--------------------------------------
Checkbox:
Checkbox()
Checkbox("String s)
==Useful Methods
getText()
setText()
-----------------------------------
CheckboxGroup:
CheckboxGroup() --constructor
Checkbox(String s,CheckboxGroup(ckbg),boolean selected);
---------------------------------
TextArea:
TextArea()
TextArea(String s)
TextArea (int row, int column)
TextArea (String s, int row, int col)
-------
Events Handling
class classname implements ActionListener{

public void actionPerformed(ActionEvent e){
//implementation code...
}
}
attached listener
componentobject.addlistener();

-----8/23-------
Choice:
Choice();
choiceObj.addItem(String item)
choiceObj.add(String item)

List:
List();
listObj.add (String item);
 */
public class MyForm extends Frame implements ActionListener {
    static Button btnexit;
    public static void main(String[] args) {
        MyForm form= new MyForm();
        Label lbl = new Label("Username:");
        TextField t1= new TextField("Enter some text", 40);

        Label lblcourse = new Label("Courses:");
        Checkbox checkbox = new Checkbox("Basic",true);
        Checkbox checkbox1 = new Checkbox("Java");
        Checkbox checkbox2 = new Checkbox(" Python");

        CheckboxGroup checkboxGroupGender = new CheckboxGroup();
        Checkbox ckbMale = new Checkbox("Male",checkboxGroupGender,true);
        Checkbox ckbFemale= new Checkbox("Female", checkboxGroupGender,false);
        Label lblgender = new Label("Gender:");

        TextArea ta= new TextArea(4,10);
        Label lblcomments = new Label("Comments:");

        Choice country = new Choice();// choice function 8/23
        country.addItem("Nepal");
        country.addItem("Australia");
        country.addItem("United States");
        Label lblcountry= new Label("Country");

        List list = new List(); // list function 8/23
        list.add("IPhone");
        list.add("Sumsung");
        list.add("Nokia");
        list.add("Motorola");
        Label lblmobile = new Label("Smart Phones:");

        btnexit = new Button("Exit");

        form.setVisible(true);
        form.setLayout((new FlowLayout()));
        form.setSize(600,300);
        form.setTitle("My Form");

        //adding components to frame
        form.add(lbl);
        form.add(t1);

        form.add(lblcourse);
        form.add(checkbox);
        form.add(checkbox1);
        form.add(checkbox2);

        form.add(lblgender);
        form.add (ckbMale);
        form.add(ckbFemale);

        form.add(lblcomments);
        form.add(ta);

        form.add(lblcountry);
        form.add(country);
        form.add(lblmobile);
        form.add(list);


        form.add(btnexit);
        btnexit.addActionListener(form);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnexit){
            System.out.println("Exit Button Pressed");
            System.exit(0);
        }

    }
}
