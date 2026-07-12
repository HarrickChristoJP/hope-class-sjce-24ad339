import java.util.*;
public class Print1toN {

    static int count=1;

    public static void call(int n){
        if(n>0){
            System.out.print(count+" ");

            count++;n--;

            call(n);
        }

        

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
       int n=sc.nextInt();
       call(n);
       
        
    }
}