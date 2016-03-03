public class Varibables {
    
    public static void main(String[] args) {
        
        boolean b = true;
        boolean b2 = 3<5;
        boolean b3 = 3>10;
        System.out.println("b3 "+b3);
        
        boolean b4 = b3;
        boolean b5 = 3<5 && b3; //true && false
        
        int i = 3;
        int i2 = 2;
        int i3 = i + i2;
        System.out.println("i3 "+i3);
        
        System.out.println("b5: "+b5);
        
        
        
        double d = 5.3;
        int k =(int)d + 7 - i * i2; // *,/ > +,-
        
        System.out.println("k: "+k);
        
        k =(int)d + (7 - i) * i2;
        System.out.println("k: "+k);
        
        k =((int)d + (7 - i)) * i2;
        System.out.println("k: "+k);
        
        
        
    }
    
    
}
