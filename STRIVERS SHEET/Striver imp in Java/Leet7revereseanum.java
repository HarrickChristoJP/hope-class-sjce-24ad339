import java.util.*;
public class Leet7revereseanum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt(); 

        
        int result=0;
        while(x!=0){
            int rem=x%10;
            if(result> Integer.MAX_VALUE/10 || result< Integer.MIN_VALUE/10) System.out.println(0) ;
            result=result*10+rem;
            x/=10;
        }
        System.out.println(result);
        
    }
}