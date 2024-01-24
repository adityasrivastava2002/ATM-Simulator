
package atm.simulator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;     


public class Withdrawl extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;
    Withdrawl(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        b1 = new JButton("WITHDRAW");
        b2 = new JButton("BACK");
        
        setLayout(null);
        
        l1.setBounds(190,350,400,35);
        l3.add(l1);
        
        t1.setBounds(190,420,320,25);
        l3.add(t1);
        
        b1.setBounds(390,588,150,35);
        l3.add(b1);
        
        b2.setBounds(390,633,150,35);
        l3.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(960,1080);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            String number = t1.getText();
            Date date = new Date();
            if(number.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter amount you want to withdraw");
            } else {
                try{
                    Conn conn = new Conn();
                    ResultSet res = conn.s.executeQuery("select * from bank where pin='"+pin+"'");
                    int balance=0;
                    while(res.next()) {
                        if(res.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(res.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(res.getString("amount"));
                        }
                    }
                    if(balance<Integer.parseInt(number)) {
                        JOptionPane.showMessageDialog(null, "Insuffiecient Balance");
                        return;
                    }
                    String q = "insert into bank values ('"+pin+"','"+date+"','Withdraw','"+number+"')";
                    conn.s.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Rs. "+number+" Withdrawn Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        } else if(ae.getSource()==b2) {
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
    }
    public static void main(String[] args){
        new Withdrawl("").setVisible(true);
    }
    
}
