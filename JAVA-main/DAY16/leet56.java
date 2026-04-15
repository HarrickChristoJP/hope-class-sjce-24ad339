package DAY16;

import java.util.*;

class Solution56 {
    public int[][] merge(int[][] intervals) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int[] i : intervals) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i[0]);
            temp.add(i[1]);
            list.add(temp);
        }

        Collections.sort(list, (a, b) -> a.get(0) - b.get(0));

        for (ArrayList<Integer> cur : list) {
            if (result.isEmpty() || result.get(result.size() - 1).get(1) < cur.get(0)) {
                result.add(cur);
            } else {
                ArrayList<Integer> last = result.get(result.size() - 1);
                last.set(1, Math.max(last.get(1), cur.get(1)));
            }
        }

        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i][0] = result.get(i).get(0);
            res[i][1] = result.get(i).get(1);
        }

        return res;
    }
}

public class leet56 {
    public static void main(String[] args) {

        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        Solution56 sol = new Solution56();
        int[][] result = sol.merge(intervals);

        // Print result
        for (int i = 0; i < result.length; i++) {
            System.out.println("[" + result[i][0] + ", " + result[i][1] + "]");
        }
    }
}