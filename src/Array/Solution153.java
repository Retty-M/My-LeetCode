package Array;

/**
 * Created by Retty on 2016-04-16.
 * Find Minimum in Rotated Sorted Array
 * 在Solution33中有应用
 */
public class Solution153 {

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] < nums[end])
                return nums[start];

            int mid = (start + end) / 2;

            if (nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }

        return nums[start];
    }

}
