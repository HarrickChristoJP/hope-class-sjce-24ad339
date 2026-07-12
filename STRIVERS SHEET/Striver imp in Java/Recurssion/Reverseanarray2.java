import java.util.*;
public class Reverseanarray2{

    public static int[] call(int[] arr,int left,int right){
        
        if(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
            call(arr,left,right);
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int itr=0;itr<n;itr++)  arr[itr]=sc.nextInt();

        int left=0,right=n-1;

        int[] ans=call(arr,left,right);

        System.out.print(Arrays.toString(ans));



        
    }
} 