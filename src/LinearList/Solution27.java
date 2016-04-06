package LinearList;

/**
 * Created by Retty on 2016-03-27.
 */
public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }

}
