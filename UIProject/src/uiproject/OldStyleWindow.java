package uiproject;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class OldStyleWindow extends JFrame{

    public OldStyleWindow() {
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
    }

    
    public static void main(String[] args) {
        //new OldStyleWindow();
        
        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jf.setLayout(new FlowLayout());
        
        JButton jb = new JButton("asdf");
        jb.setSize(100, 50);
        jf.add(jb);
        
        MyActionListener al = new MyActionListener();
        jb.addActionListener(al);
        
        
        
        
        JLabel jl = new JLabel("llllasdf");
        jf.add(jl);
        
    }
    
    
}
