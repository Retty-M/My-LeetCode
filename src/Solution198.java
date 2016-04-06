/**
 * Created by Retty on 2016-03-20.
 */
public class Solution198 {
	
	public int rob(int[] nums) {
        int take = 0;
        int notake = 0;
        int maxProfit = 0;
        for (int i = 0; i < nums.length; i++) {
			take = notake + nums[i];
			notake = maxProfit;
			maxProfit = Math.max(take, notake);
		}
        return maxProfit;
    }
	
}
