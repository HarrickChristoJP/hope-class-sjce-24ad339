import java.util.*;
public class Hashing1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        //hashing

        int[] hash=new int[100];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        System.out.print("Enter the number to be searched:");
        int search =sc.nextInt(); // the count 
        System.out.print("The element "+search+" occurs :"+hash[search]); 
    }
}


// the hash function could be kept inside the 1st loop as it could redcue O(2n)=O(n)