import java.util.*;

/**
 * Created by Retty on 2016-03-26.
 */
public class Solution15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> list = new LinkedList<>();

        for (int i = 0; i < length-2; i++) {
            if (i==0 || (i>0 && nums[i]!=nums[i-1])) {
                int lo = i+1, hi = length-1, sum = 0-nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        list.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return list;
    }

}
