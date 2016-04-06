import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Retty on 2016-03-27.
 */
public class Solution18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        int len = nums.length;
        if (len < 4) return result;
        Arrays.sort(nums);

        for (int i = 0; i < len-3; i++) {
            if (i==0 || nums[i] != nums[i-1]) {
                for (int j = i + 1; j < len - 2; j++) {
                    if (j==i+1 || nums[j] != nums[j-1]) {
                        int start = j + 1, end = len - 1, sum = target - nums[i] - nums[j];
                        while (start < end) {
                            if (sum == nums[start] + nums[end]) {
                                result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                                while (start < end && nums[start] == nums[start + 1]) start++;
                                while (start < end && nums[end] == nums[end - 1]) end--;
                                start++;
                                end--;
                            } else if (sum > nums[start] + nums[end]) start++;
                            else end--;
                        }
                    }
                }
            }
        }
        return result;
    }

}
