package ders2;

import javax.swing.JOptionPane;

public class Input {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("enter number");
        
        int a = Integer.parseInt(s);
        
        int k = a + 3;
        System.out.println(k);
        
        String t =JOptionPane.showInputDialog("enter a number");
        int p = Integer.parseInt(t);
        int y= a+p;
        System.out.println (y);
        
    }
    
}


