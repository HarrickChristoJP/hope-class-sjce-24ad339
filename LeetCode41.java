import java.util.*;
public class LeetCode41{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int var=sc.nextInt();
            arr.add(var);
        }
        for(int i=0;i<n;i++){
            if(arr.get(i)<=0) 
                arr.remove(i);
        }
        Collections.sort(arr);
        for(int i=1;i<=n;i++){
            for(int num:arr){
                if(num!=1){ 
                    System.out.print(1);
                    return;
                }
                else if(num+1!=num){
                    System.out.print(num+1);
                    return;
                }
            }
        }
    }
}