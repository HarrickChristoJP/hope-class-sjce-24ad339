import java.util.*;
public class Left {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder newstr = new StringBuilder();
        String str=sc.nextLine();
        int len=str.length();
        for (int ind=0;ind<len;ind++)
        {
            char ch=str.charAt(ind);
            if (ch=='a'|| ch=='e' || ch=='i' || ch=='u' || ch=='o')
            {
                newstr.append('*');
            }
            else
            {
                newstr.append(ch);
            }
        }
        System.out.print(newstr.toString());
    }
}