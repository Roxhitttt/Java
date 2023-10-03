import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class greaterthan extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3;

    greaterthan(){
        setLayout(null);

        l1 = new JLabel("No 1 : ");
        l1.setBounds(20,20,40,20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(70,20,80,20);
        add(t1);

        l2 = new JLabel("No 2 : ");
        l2.setBounds(20,50,40,20);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(70,50,80,20);
        add(t2);

        l3 = new JLabel("Result : ");
        l3.setBounds(20,80,60,20);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(90,80,80,20);
        add(t3);

        b1 = new JButton("Greater Than");
        b1.setBounds(20,110,110,20);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Smaller Than");
        b2.setBounds(140,110,110,20);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Clear");
        b3.setBounds(260,110,80,20);
        b3.addActionListener(this);
        add(b3);
    }

    public void actionPerformed(ActionEvent e){
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int n3;
        if(e.getSource() == b1){
            if(n1 > n2){
                n3 = n1;
                t3.setText(String.valueOf(n3));
            }
            else{
                n3 = n2;
                t3.setText(String.valueOf(n3));
            }  
        }
        if(e.getSource() == b2){
            if(n1 < n2){
                n3 = n1;
                t3.setText(String.valueOf(n3));
            }
            else{
                n3 = n2;
                t3.setText(String.valueOf(n3));
            }  
        }
        if(e.getSource() == b3){ 
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t1.removeAll();
            t2.removeAll();
            t3.removeAll();
        }
    }
}

public class textboxbutton_3 {
public static void main(String args[]){
        greaterthan o = new greaterthan();
        o.setSize(500,500);
        o.setVisible(true);
    }
}
