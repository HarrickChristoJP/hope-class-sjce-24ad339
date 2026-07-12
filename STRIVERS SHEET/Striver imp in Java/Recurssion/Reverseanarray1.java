import java.util.*;
public class Reverseanarray1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int itr=0;itr<n;itr++)  arr[itr]=sc.nextInt();

        for(int left=0,right=n-1;left<=right;left++,right--){

            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }

        System.out.print(Arrays.toString(arr));



        
    }
}