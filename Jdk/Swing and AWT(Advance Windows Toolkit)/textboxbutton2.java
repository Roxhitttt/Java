import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calculator extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4,b5;

    calculator(){
        setLayout(null);

        l1 = new JLabel("No 1 : ");
        l1.setBounds(20, 20, 50, 20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(80, 20, 80, 20);
        add(t1);

        l2 = new JLabel("No 2 : ");
        l2.setBounds(20, 50, 50, 20);
        add(l2);

        t2 = new JTextField();  
        t2.setBounds(80, 50, 80, 20);
        add(t2);

        l3 = new JLabel("Result : ");
        l3.setBounds(20,80,50,20);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(80,80,80,20);
        add(t3);

        b1 = new JButton("Add");
        b1.setBounds(20, 110, 80, 20);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Sub");
        b2.setBounds(110, 110, 80, 20);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Div");
        b3.setBounds(200, 110, 80, 20);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("Mul");
        b4.setBounds(290, 110, 80, 20);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("Clear");
        b5.setBounds(380, 110, 80, 20);
        b5.addActionListener(this);
        add(b5);
    }
    public void actionPerformed(ActionEvent e){
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        if(e.getSource()==b1){
            int n3 = n1 + n2;
            t3.setText(String.valueOf(n3));
        }
        if(e.getSource()==b2){
            int n3 = n1 - n2;
            t3.setText(String.valueOf(n3));
        }
        if(e.getSource()==b3){
            int n3 = n1 / n2;
            t3.setText(String.valueOf(n3));
        }
        if(e.getSource()==b4){
            int n3 = n1 * n2;
            t3.setText(String.valueOf(n3));
        }
        if(e.getSource()==b5){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t1.removeAll();
            t2.removeAll();
            t3.removeAll();
        }
    }
}
public class textboxbutton2 {
    public static void main(String args[]){
        calculator o = new calculator();
        o.setSize(500,500);
        o.setVisible(true);
    }
}