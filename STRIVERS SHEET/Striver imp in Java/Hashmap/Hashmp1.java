import java.util.*;
public class Hashmp1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<n;i++){
            int value=0;
            if(hash.containsKey(arr[i])) value=hash.get(arr[i]);  // can use hash(arr[i],getOrDefault(arr[i],0)+1);
            hash.put(arr[i],++value);

        }
        int search=sc.nextInt();
        System.out.print("The hash value is: "+hash.get(search));

    }
    
}