
package atm.simulator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupTwo extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton b1,b2;
    String formno = "";
    public SignupTwo(String formno) {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        setLayout(null);
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1); 
        getContentPane().setBackground(Color.WHITE);
        
        l2 = new JLabel("Account Type");
        l2.setBounds(100, 140, 400, 40);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);
        
        r1 = new JRadioButton("Savings Account");
        r1.setBounds(100, 180, 300, 30);
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(400, 180, 300, 30);
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setBounds(100, 220, 300, 30);
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(400, 220, 300, 30);
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        bg1.add(r4);
        
        
        l3 = new JLabel("5040-XXXX-XXXX-XXXX");
        l3.setBounds(300, 280, 400, 40);
        l3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l3);
        
        l4 = new JLabel("Card Number");
        l4.setBounds(100, 280, 400, 40);
        l4.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l4);
        
        l5 = new JLabel("Your 16 digit card number");
        l5.setBounds(100, 310, 400, 40);
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l5);
        
        l6 = new JLabel("XXXX");
        l6.setBounds(300, 360, 400, 40);
        l6.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l6);
        
        l7 = new JLabel("Pin");
        l7.setBounds(100, 360, 400, 40);
        l7.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l7);
        
        l8 = new JLabel("Your 4 digit password");
        l8.setBounds(100, 390, 400, 40);
        l8.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l8);
        
        l9 = new JLabel("Services Required");
        l9.setBounds(100, 450, 400, 40);
        l9.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l9);
        
        c1 = new JCheckBox("Cheque Book");
        c1.setBounds(100, 500, 200, 30);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 18));
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(300, 500, 200, 30);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 18));
        add(c2);
        
        c3 = new JCheckBox("ATM Card");
        c3.setBounds(100, 540, 200, 30);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(c3);
        
        c4 = new JCheckBox("Mobile banking");
        c4.setBounds(300, 540, 200, 30);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(c4);
        
        c5 = new JCheckBox("E-Statement");
        c5.setBounds(100, 580, 200, 30);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 18));
        add(c5);
        
        c6 = new JCheckBox("Email & SMS Alerts");
        c6.setBounds(300, 580, 200, 30);
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBounds(100, 640, 500, 30);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        add(c7);
        
        b1 = new JButton("Submit");
        b1.setBounds(250, 680, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Raleway", Font.BOLD, 15));
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Cancel");
        b2.setBounds(450, 680, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Raleway", Font.BOLD, 15));
        add(b2);
        b2.addActionListener(this);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String atype="";
        if(r1.isSelected()){
            atype="Savings Account";
        }
        else if(r2.isSelected()){
            atype="Fixed Deposit Account";
        }
        else if(r3.isSelected()){
            atype="Current Account";
        }
        else if(r1.isSelected()){
            atype="Recurring Deposit Account";
        }
        Random ran = new Random();
        String cardno = "" + Math.abs((ran.nextLong()%90000000L) + 5040936000000000L);
        
        String pin  = "" + Math.abs((ran.nextLong()%9000L) + 1000L);
        
        String facility = "";
        if(c1.isSelected()) {
            facility += " Cheque Book";
        }
        else if(c2.isSelected()) {
            facility += " Internet Banking";
        }
        else if(c3.isSelected()) {
            facility += " ATM Card";
        }
        else if(c4.isSelected()) {
            facility += " Mobile Banking";
        }
        else if(c5.isSelected()) {
            facility += " E-Statement";
        }
        else if(c6.isSelected()) {
            facility += " Email & SMS Alerts";
        }
        try {
            if(ae.getSource() == b1) {
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields.");
                }
                else {
                    Conn c1 = new Conn();
                    String q1 = "insert into signup2 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:" + pin);
                    setVisible(false);
                    new Deposit(pin).setVisible(true);
                }
            } 
            else if(ae.getSource()==b2) {
                setVisible(false);
                new Login().setVisible(true);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] args) {
        new SignupTwo("").setVisible(true);
    }
}
