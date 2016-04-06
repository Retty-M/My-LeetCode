package LinearList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Retty on 2016-03-19.
 */
public class Solution33 {

    public int search(int[] nums, int target) {
        /*
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        if (map.get(target) == null) {
            return -1;
        }
        return map.get(target);*/

        int minIndex = findMinIndex(nums);
        int len = nums.length;
        int start = 0;
        int end = 0;
        if (target <= nums[len-1]) {
            start = minIndex;
            end = len - 1;
        }else  {
            start = 0;
            end = minIndex - 1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public int findMinIndex(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

}
