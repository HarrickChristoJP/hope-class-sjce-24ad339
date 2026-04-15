package DAY15;

import java.util.*;

public class MergeIntervals {

    public static ArrayList<ArrayList<Integer>> merge(ArrayList<ArrayList<Integer>> intervals) {

        Collections.sort(intervals, (a, b) -> a.get(0) - b.get(0));

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (ArrayList<Integer> current : intervals) {

            if (result.isEmpty() || result.get(result.size() - 1).get(1) < current.get(0)) {
                result.add(current);
            } else {
                ArrayList<Integer> last = result.get(result.size() - 1);
                last.set(1, Math.max(last.get(1), current.get(1)));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> intervals = new ArrayList<>();

        intervals.add(new ArrayList<>(Arrays.asList(1, 3)));
        intervals.add(new ArrayList<>(Arrays.asList(2, 6)));
        intervals.add(new ArrayList<>(Arrays.asList(8, 10)));
        intervals.add(new ArrayList<>(Arrays.asList(15, 18)));

        ArrayList<ArrayList<Integer>> result = merge(intervals);

        System.out.println(result);
    }
}