package DAY14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEg {
    public static void main(String[] args) {
        Set<Integer> Lset = new LinkedHashSet<>();
        Set<Integer> Hset = new HashSet<>();
        int[] arr = {5, 3, 9, 1, 7, 2};
        for(int i : arr){
            Lset.add(i);
            Hset.add(i);
        }
        System.out.println("LinkedHashSet: " + Lset);
        System.out.println("HashSet: " + Hset);
    }
}
