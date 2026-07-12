import java.util.*;
public class Leet9Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt(); 

        int n=x;
        int res=0;

        while(x!=0){
            int r=x%10;

            res=res*10+r;

            x/=10;
        }
        System.out.print(res);
        
        
    }
}