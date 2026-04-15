package DAY15;

import java.util.*;

public class ClosestElement {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println("Enter target element:");
        int k = sc.nextInt();
        int c = set.lower(k);
        int d = set.higher(k);
        int a = Math.abs(c - k);
        int b = Math.abs(d - k);
        if (a < b) {
            System.out.println("The closest element to " + k + " is " + c);
        } else if (a > b) {
            System.out.println("The closest element to " + k + " is " + d);
        } else {
            System.out.println("The closest element to " + k + " is " + c);
        }
        sc.close();
    }
}
