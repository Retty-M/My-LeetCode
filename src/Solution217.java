/**
 * Created by Retty on 2016-03-20.
 */
import java.util.Arrays;

public class Solution217 {
	
	public boolean containsDuplicate(int[] nums) {
	    Arrays.sort(nums);
	    for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == nums[i+1]) {
				return true;
			}
		}
	    return false;
	}

}
