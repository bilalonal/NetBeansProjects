package ders3;

public class DistanceCalculator {

    public static void main(String[] args) {
        
        double speed = 56;
        double time = 3;
        
        double distance = calcDistance(speed, time);
        
        System.out.println("Distance traveled is " + distance + "km");
        
    }
    
    private static double calcDistance(double speed, double time) {
       return speed * time;
    }
}