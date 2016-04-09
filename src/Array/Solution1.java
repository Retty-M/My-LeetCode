package Array;
/**
 * Created by Retty on 2016-03-20.
 */
import java.util.HashMap;
import java.util.Map;

public class Solution1 {

	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		int[] result = {0, 0};
		
//        for (int i = 0; i < length; i++) {
//			result[0] = i + 1;
//			for (int j = i+1; j < length; j++) {
//				if(nums[j] == target-nums[i]) {
//					result[1] = j + 1;
//					break;
//				}
//			}
//			if(result[1] != 0) break;
//		}
		
		Map<Integer, Integer> temp = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (temp.containsKey(target - nums[i])) {
				result[0] = temp.get(target - nums[i]);
				result[1] = i + 1;
				break;
			}
			temp.put(nums[i], i + 1);
		}
		
        return result;
    }
	
}
