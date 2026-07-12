import java.util.*;
public class PrintNtimesname {

    static int count=1;

    public static void call(int n,String s){
        if(n>0){
            System.out.print(s+" ");

            count++;n--;

            call(n,s);
        }

        

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
       int n=sc.nextInt();
       String str=sc.next();
       call(n,str);
       
        
    }
}