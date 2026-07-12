import java.util.*;
public class Adams{
    public static int sqr(int x){
        return x*x;
    }
    public static int revs(int num){
        int rem,ans=0;
        while(num!=0){
            rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num_sq=sqr(num);//144
        int r=revs(num);//21
        int rs=sqr(r);//441
        int fin=revs(rs);//144
        System.out.print((num==fin) ? "It is an Adams Number" : "Its is not an Adams Numbers");

    }
}