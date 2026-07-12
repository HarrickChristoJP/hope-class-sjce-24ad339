import java.util.*;
public class Arrayinsertion{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size+1];
        for(int ind=0;ind<size;ind++){
            arr[ind]=sc.nextInt();
        }
        int loc=sc.nextInt();
        int key=sc.nextInt();
        for(int ind=size-1;ind<=0;ind--){
            
            arr[ind+1]=arr[ind];
            if(ind<loc)
                break;
            
        }
        arr[loc-1]=key; 
        for(int ind=0;ind<size+1;ind++){
            System.out.print(arr[ind]+" ");
        }
        String str;
        
            
    }
}