import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        
        System.out.print(trap(arr,n));
        
    }
    public static int trap(int [] arr, int n){
        int [] left = new int[100000];
        int [] right = new int[100000];
        left[0]=arr[0];
        right[n-1] = arr[n-1];
        
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int water = 0;
        for(int i=0;i<n;i++){
            int current = Math.min(left[i],right[i])-arr[i];
            water+=current;
        }
        return water;
    }
    
}
