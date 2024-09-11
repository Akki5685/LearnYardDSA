package Arrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 *  and return an array of the non-overlapping intervals that cover all the intervals in the input.
*/

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] interval : intervals)
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0])
                ans.add(interval);
            else
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);

        return ans.toArray(int[][] ::new);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);

        // Print merged intervals
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
