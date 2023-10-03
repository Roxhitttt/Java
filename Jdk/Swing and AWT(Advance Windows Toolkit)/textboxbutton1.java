import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class demo3 extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    demo3() {

        setLayout(null);

        l1 = new JLabel("No 1 : ");
        l1.setBounds(10, 20, 50, 20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(80, 20, 100, 20);
        add(t1);

        l2 = new JLabel("No 2 : ");
        l2.setBounds(10, 40, 50, 40);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(80, 40, 100, 40);
        add(t2);

        l3 = new JLabel("Result : ");
        l3.setBounds(10, 60, 50, 60);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(80, 60, 100, 60);
        add(t3);

        b1 = new JButton("Add");
        b1.setBounds(10, 50, 100, 20);
        b1.addActionListener(this);
        add(b1);
    }
}

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

public class textboxbutton1 {
    public static void main(String args[]){
        demo3 o = new demo3();
        o.setSize(500,500);
        o.setVisible(true);
    }
}
