import java.util.*;
public class PrintNto1 {

    static int count=1;

    public static void call(int n){
        if(n>0){
            System.out.print(n+" ");

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