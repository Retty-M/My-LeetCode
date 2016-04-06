import java.util.Arrays;

/**
 * Created by Retty on 2016-03-27.
 */
public class Solution16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length-1];
        for (int i = 0; i < nums.length-2; i++) {
            int lo = i+1, hi = nums.length-1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum == target) return target;
                if (sum > target) {
                    while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                    hi--;
                }
                else {
                    while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                    lo++;
                }
                if (Math.abs(sum-target) < Math.abs(result-target)) {
                    result = sum;
                }
            }
        }
        return result;
    }

}
