import java.util.*;
public class Arrayfreqcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            int value=0;
            if(hash.containsKey(arr[i])) value=hash.get(arr[i]);
            hash.put(arr[i],value+1);
        }

        hash.forEach((k,v) ->{
            System.out.println("The key "+k+" value "+v);
        });

    }
}