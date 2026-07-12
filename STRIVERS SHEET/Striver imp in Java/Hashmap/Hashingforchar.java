import java.util.*;
public class Hashingforchar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        int[] hash=new int[256];

        for(int i=0;i<str.length();i++){
            int var=str.charAt(i);
            hash[var]+=1;

        }
        System.out.print("Enter the search element:");
        char search=sc.next().charAt(0);

        System.out.print("The count is : "+hash[search]);
    

        
 
    }
}


// for small case hash[24] & use ( - 'a')