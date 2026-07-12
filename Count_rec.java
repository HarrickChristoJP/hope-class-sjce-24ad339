import java.util.*;
public class Count_rec{
    public static int count(int num,int cou){
        if(num==0)
            return cou;
        else
            cou++;
            return  count(num/10,cou);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cou=0;
        System.out.print(count(num,cou));
    }
}