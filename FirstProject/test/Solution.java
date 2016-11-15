import java.io.*;
import static java.lang.System.exit;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        if((x1<x2 && v1<=v2)||(x1>x2&&v1>=v2)){
            
        
            System.out.println("NO");
        }
        else{
            for(int i = 0; i<10000; i++){
                if(x1 + v1 * i == x2+ v2 * i){
                    System.out.println("YES");
                    exit(0);
                }
            }
            
            System.out.println("NO");
        }
   }
}