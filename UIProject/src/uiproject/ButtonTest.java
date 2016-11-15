package uiproject;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;


public class ButtonTest extends JFrame implements ActionListener{
    
    JLabel jl;
    
    public ButtonTest()  {
        
        
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JButton jb = new JButton("asdf");
        jb.setSize(100, 50);
        add(jb);
        
        
        jb.addActionListener(this);
        jb.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent evt){
                        System.out.println("xxx");
                    }
                }
        );
        
        
        jl = new JLabel("llllasdf");
        add(jl);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("x");
        jl.setText("newText");
    }
    
    
    
    public static void main(String[] args) {
        new ButtonTest();
    }


    
    
}
