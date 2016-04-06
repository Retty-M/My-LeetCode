/**
 * Created by Retty on 2016-03-20.
 */
public class Solution191 {

	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	/*String num = Integer.toBinaryString(n);
        char[] nums = num.toCharArray();
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, '1');
        if (index >= 0) {
            return nums.length-index;
        }else {
            return 0;
        }*/
    	int re = 0;
        while(0 != n)
        {
            n = n&(n - 1);
            ++re;
        }
        return re;
    }
	
}
