import java.util.*;

public class Gcd{

    public int find(int a,int b){
        return b=0?a:find(b,a%b);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=find(a,b);

        System.out.println(c);


        
    }
}