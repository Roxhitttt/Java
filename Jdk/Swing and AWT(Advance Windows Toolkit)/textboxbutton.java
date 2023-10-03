import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframenew extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1, t2, t3;
    JButton b1;

    myframenew() {

        setLayout(null);

        l1 = new JLabel("No 1 : ");
        l1.setBounds(10, 20, 50, 20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(80, 20, 100, 20);
        add(t1);

        l2 = new JLabel("No 2 : ");
        l2.setBounds(10, 50, 50, 20);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(80, 50, 100, 20);
        add(t2);

        l3 = new JLabel("Result : ");
        l3.setBounds(10, 80, 50, 20);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(80, 80, 100, 20);
        add(t3);

        b1 = new JButton("Add");
        b1.setBounds(10, 110, 100, 20);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3;
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = n1 + n2; 
        s3 = String.valueOf(n3);
        t3.setText(s3);
    }

}

public class textboxbutton {
    public static void main(String args[]){
        myframenew o = new myframenew();
        o.setSize(500,500);
        o.setVisible(true);
    }
}
