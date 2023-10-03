import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    
class demo extends JFrame implements ActionListener{ 
    JLabel l1;
    JTextField t1;
    JButton b1;

    demo(){
        setLayout(null);
        l1 = new JLabel("no1");
        l1.setBounds(10,20,50,20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(80,20,100,20);
        add(t1);

        b1 = new JButton ("Show");
        b1.setBounds(10,50,100,20);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent e){
        String s1=t1.getText();
        System.out.println(s1);
    }

} 

public class awt_and_swing2 {
    public static void main(String args[]){
        demo o = new demo();
        o.setSize(500,500);
        o.setVisible(true);

    }
}
