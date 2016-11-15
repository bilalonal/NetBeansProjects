package objects;

public class TestClass {


    public static void main(String[] args) {
        
        /*Rectangle r1 = new Rectangle();
        r1.width = 5;
        r1.height = 3;
        
        Rectangle r2 = new Rectangle();
        r2.width = 15;
        r2.height = 13;*/
        
        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = new Rectangle(13, 15);
        r1 = r2;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println(r1.width);
        System.out.println(r2.width);
        
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        
        
        
        
        
        
    }
    
}
