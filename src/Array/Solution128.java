package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Retty on 2016-03-26.
 */
public class Solution128 {

    public int longestConsecutive(int[] nums) {
        /*int result = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int longest = 0;
            while (set.contains(nums[i]++)) longest++;
            while (set.contains(nums[i]--)) longest++;
            result = Math.max(result, longest);
        }
        return result;*/

        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                int left = map.containsKey(num-1) ? map.get(num-1) : 0;
                int right = map.containsKey(num+1) ? map.get(num+1) : 0;
                int sum = left + right + 1;
                map.put(num, sum);
                map.put(num-left, sum);
                map.put(num+right, sum);
                result = Math.max(result, sum);
            }
        }
        return result;
    }

}
