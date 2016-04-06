/**
 * Created by Retty on 2016-03-20.
 */
import java.util.Arrays;

public class Solution169 {
	
	public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
	
}
