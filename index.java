import javax.swing.*;    
public class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("CALCULATOR");  
    JButton b=new JButton("1");  
    JButton c=new JButton("2");
    JButton d=new JButton("3");
    JButton e=new JButton("4");
    JButton g=new JButton("5");
    JButton a=new JButton("6");
    b.setBounds(50,100,95,30);
    c.setBounds(50,100,95,30);
    d.setBounds(50,100,95,30);
    e.setBounds(50,100,95,30);
    g.setBounds(50,100,95,30);
    a.setBounds(50,100,95,30);
    f.add(b);
    f.add(c);
    f.add(d);
    f.add(e);
    f.add(g);
    f.add(a);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  
