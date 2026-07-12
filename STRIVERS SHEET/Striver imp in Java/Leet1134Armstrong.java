import java.util.*;
public class Leet1134Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt(); 

        int n=x , count=0;

        while(n!=0){

            count++;
            n/=10;
        }

        n=x;
        int result=0;
        while(x!=0){
            int rem=x%10 ;
            int p= (int)Math.pow(rem,count);
            result=result+p;
            x/=10;
        }

        if(n==result) System.out.println(true);

        else System.err.println(false);

       
       
        
        
    }
}