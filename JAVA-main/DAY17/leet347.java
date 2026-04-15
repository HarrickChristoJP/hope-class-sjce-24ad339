package DAY17;

import java.util.*;

public class leet347 {

    static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            if (k == nums.length) {
                return nums;
            }

            Map<Integer, Integer> count = new HashMap<>();
            for (int n : nums) {
                count.put(n, count.getOrDefault(n, 0) + 1);
            }

            Queue<Integer> heap = new PriorityQueue<>(
                    (a, b) -> count.get(a) - count.get(b));

            for (int n : count.keySet()) {
                heap.add(n);
                if (heap.size() > k) {
                    heap.poll();
                }
            }

            int[] ans = new int[k];
            for (int i = 0; i < k; i++) {
                ans[i] = heap.poll();
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int[] result = sol.topKFrequent(nums, k);

        System.out.println("Top K Frequent Elements:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}