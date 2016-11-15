package objects;

public class Rectangle {

    int width;
    int height;
    
    //constructor
    //same name as the class name
    //no return type
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    
    int getArea(){
        return width * height;
    }
    
    
    
}
