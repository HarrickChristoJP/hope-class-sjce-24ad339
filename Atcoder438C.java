import java.util.*;
public class Atcoder438C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        
        int n = sc.nextInt();

        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (!stack.isEmpty() && stack.peek() == num) {
                
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        System.out.println(stack.size());

    }
}
