package DAY17;

import java.util.*;

public class leet560 {

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);

            int sum = 0;
            int count = 0;

            for (int num : nums) {
                sum += num;

                if (map.containsKey(sum - k)) {
                    count += map.get(sum - k);
                }

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
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

        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " = " + result);

        sc.close();
    }
}