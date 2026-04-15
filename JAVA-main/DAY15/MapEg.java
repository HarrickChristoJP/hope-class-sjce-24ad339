package DAY15;

import java.util.HashMap;
import java.util.Map;

public class MapEg {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        System.out.println(map.keySet());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Frequency of elements in the array
        for (int i : arr) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        System.out.println(freq.keySet());
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
