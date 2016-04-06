package LinearList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Retty on 2016-03-19.
 */
public class Solution81 {

    public boolean search(int[] nums, int target) {
        /*
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) set.add(nums[i]);
        }
        return set.contains(target);
        */

        int len = nums.length;
        int start = 0, end = len - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] > nums[start]) {
                if (nums[start] <= target && nums[mid] > target) end = mid - 1;
                else start = mid + 1;
            }else if (nums[mid] < nums[start]) {
                if (nums[mid] < target && nums[end] >= target) start = mid + 1;
                else end = mid - 1;
            }else start++;
        }
        return false;
    }

}
