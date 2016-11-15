public class ArrayCreator {

    
    public static void main(String[] args) {
            
        
        int[] ar = createArray(9,1,12,9,5,6);
        
        for (int i = 0; i < ar.length; i++) {
            System.out.println( ar[i] );            
        }
        
    }
    
    
    public static int[] createArray(int size, int min, int max, int mod, int median, int average){
        
        if(size<1 || min>max)//... goes on
            return new int[0];
        
        int[] arr = new int[size];
        
        
        
        
        if(size%2==1){
            
            int len = arr.length;
            int half = len/2-1;
            arr[len-3] = median;
            arr[len-2] = min;
            arr[len-1] = max;
            int total = size * average - median - min - max;
            
            int t1 = half * min;
            int t2 = half * median;
            int t3 = half * max;
            
            if(mod>median){
                
                int total1 = mod*half;
                int total2 = total-total1;
                
                if(total2<t1){
                    total2 = t1;
                    total1 = total-t1;
                }else if(total2>t2){
                    total2 = t2;
                    total1 = total-t1;
                }
                
                int[] group1 = createGroup(half, min, median, mod, total1);
                int[] group2 = createGroup(half, median, max, mod, total2);
                
                for (int i = 0; i < arr.length-3; i++) {
                    if(i<half)
                        arr[i] = group1[i];
                    else
                        arr[i] = group2[i-half];
                    
                }
                
            }
            
            
            
            
            
        }else{
            
            
        }
        
        
        
        
        return arr;
        
    }
    
    static int[] createGroup(int size, int min, int max, int mod, int total){
        
        
        if(mod>=min && mod<=max){
            
            int[] group = new int[size];
            for (int i = 0; i < group.length; i++) {
                group[i] = mod;
            }
            
            int rem = total - mod*size;
            int dif = rem>0 ? max - mod : min - mod;
            int i=0;
            while(rem>dif){                
                group[i] += dif;
                rem -= dif;
            }
            
            group[i] += rem;
            
            return group;
            
        }else{
            
            int[] group = new int[size];
            for (int i = 0; i < group.length; i++) {
                group[i] = min;            
            }
            int rem = total - min*size;
            outer:
            for (int i = 0; i < group.length; i++) {
                for (int j = 0; j < i+1; j++) {
                    group[j]++;
                    rem--;
                    if(rem==0)
                        break outer;
                }
                
            }
            return group;
            
        }
        
        
        
        
    }

        
    
    
}
