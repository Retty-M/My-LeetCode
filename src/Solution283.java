/**
 * Created by Retty on 2016-03-20.
 */
import java.util.Arrays;

public class Solution283 {
	
	public void moveZeroes(int[] nums) {
		int newIndex = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				nums[newIndex++] = nums[i];
			}
		}
		//Array��������滻Ԫ�ص�fill����
		Arrays.fill(nums, newIndex, nums.length, 0);
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
}
