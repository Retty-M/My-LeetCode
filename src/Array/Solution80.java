package Array;

/**
 * Created by Retty on 2016-03-19.
 */
public class Solution80 {

    public int removeDuplicates(int[] nums) {
        /*自己的版本
        int index = 0;
        int startIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                startIndex = i;
                nums[++index] = nums[i];
            }else if (i - startIndex < 2) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;*/

        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i-2]) {
                nums[i++] = n;
            }
        }
        return i;
    }

}
