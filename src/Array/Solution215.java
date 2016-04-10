package Array;

import java.util.Arrays;

/**
 * Created by Retty on 2016-04-10.
 * Kth Largest Element in an Array
 * 排序然后返回即可
 */
public class Solution215 {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

}
