import java.util.*;
public class BubbleSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        // Sorting {8,9,6,74,18,22,1}

        for(int i=n-1;i>=0;i--){
            
            for(int j=0;j<=i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
            
            
        }
        System.out.print("The sorted is:"+Arrays.toString(arr));



    }
}