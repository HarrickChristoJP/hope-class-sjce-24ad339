package DAY17;

import java.util.*;

public class leet457 {

    static class Solution {
        public String frequencySort(String s) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<Character> pq = new PriorityQueue<>(
                    (a, b) -> map.get(b) - map.get(a));

            pq.addAll(map.keySet());

            StringBuilder sb = new StringBuilder();

            while (!pq.isEmpty()) {
                char c = pq.poll();
                int freq = map.get(c);

                for (int i = 0; i < freq; i++) {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        Solution sol = new Solution();
        String result = sol.frequencySort(input);

        System.out.println("Sorted by frequency: " + result);

        sc.close();
    }
}