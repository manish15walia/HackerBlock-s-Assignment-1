import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(minMovesToMakePalindrome(str));
    }
    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
      
    public static int minMovesToMakePalindrome(String s) {
        int N=s.length();
        char st[]=s.toCharArray();
        int count=0;
        for(int i=0;i<N/2;i++){
            int l=i;
            int r=N-l-1;
            while(l<r){
                if(st[l]==st[r]){
                    break;
                }
                else{
                    r--;
                }
            }
            if(l==r){
                swap(st,l,l+1);
                count++;
            }
            else{
                for(int j=r;j<N-l-1;j++){
                    swap(st,j,j+1);
                    count++;
                }
            }
        }
        return count;

    }
}
