import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframe extends JFrame{
    JLabel name,age,contact,collage;
    myframe(){
        setLayout(null);
        name = new JLabel("Name : Rohit ");
        name.setBounds(20, 20, 200, 20);
        age = new JLabel("age : 23 ");
        age.setBounds(20, 40, 200, 20);
        contact = new JLabel("Contact : 9156879469 ");
        contact.setBounds(20, 60, 200, 20);
        collage = new JLabel("Collage : Guru Gobind Singh Collage of Engineering and Research Center");
        collage.setBounds(20, 80, 200, 20);

        add(name);
        add(age);
        add(contact);
        add(collage);


        
    }
}

public class awt_and_swing{
    public static void main(String args[]){
        myframe f=new myframe();
        f.setSize(500, 500);
        f.setVisible(true);

    }
}