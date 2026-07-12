import java.util.*;
public class SelectionSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        // Sorting {8,9,6,74,18,22,1}

        for(int i=0;i<n-1;i++){
            int least=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[least]) least=j;

            }
            int temp=arr[i];
            arr[i]=arr[least];
            arr[least]=temp;

            
        }
        System.out.print("The sorted is:"+Arrays.toString(arr));



    }
}