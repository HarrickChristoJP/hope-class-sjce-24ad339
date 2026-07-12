import java.util.*;
public class SecondLargest{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();

        int arr[] =new int[n];

        System.out.print("Enter the elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int large=arr[0];
        int sec=Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(arr[i]>large){
                sec=large;
                large=arr[i];
            }
            else if(arr[i]<large && arr[i]>sec) sec=arr[i]; 
            
        }

        System.out.print("The second largest is :"+sec);

    }
}