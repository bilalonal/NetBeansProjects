package uiproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent a) {
        
        System.out.println("pressed");
        JOptionPane.showMessageDialog(null, "sdfsdf");
        
    }

    
}
