import java.util.*;
public class SumofFirstNNumbers{

    static int sum=0;

    public static int call(int n){
        if(n>0){
            
            sum+=n;
            n--;
            call(n);
        }

        return sum;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
       int n=sc.nextInt();
       int ans=call(n);
       System.out.print(ans);
        
    }
}