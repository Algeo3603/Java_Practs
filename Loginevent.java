import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class Loginevent extends JFrame implements ActionListener { 
    JFrame jf; 
    JLabel l1,l2; 
    JTextField tf1; 
    JPasswordField tf2; 
    JButton b1,b2; 
    Loginevent() { 
        jf= new JFrame("Login Test"); 
        tf1=new JTextField(10); 
        l1=new JLabel("username"); 
        //tf2=new JTextField(10); 
        l2=new JLabel("Pwd"); 
        tf2 = new JPasswordField(10);    
        b1=new JButton("OK"); 
        b2=new JButton("Reset"); 
        jf.setLayout(new FlowLayout()); 
        jf.add(l1); 
        jf.add(tf1); 
        jf.add(l2); 
        jf.add(tf2); 
        //tf2.add(value); 
        jf.add(b1); 
        jf.add(b2); 
        b1.addActionListener(this); 
        b2.addActionListener(this); 
        jf.setSize(500,100); 
        jf.setVisible(true); 
    } 
    public void actionPerformed(ActionEvent e) { 
        if(e.getSource()==b1) { 
            String s1=tf1.getText(); 
            //String s2=tf2.getText(); 
            String s2 = String.valueOf(tf2.getPassword()); 
            System.out.println("login="+s1); 
            System.out.println("pwd="+s2); 
        } else if(e.getSource()==b2) { 
            tf1.setText(" "); 
            tf2.setText(" "); 
        } 
    } 
    public static void main(String args[]) { 
        Loginevent x=new Loginevent(); 
    }
} 