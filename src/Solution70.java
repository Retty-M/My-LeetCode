/**
 * Created by Retty on 2016-03-20.
 */

public class Solution70 {
	
	public static int climbStairs(int n) {
		if (n < 0) return 0;
		if (n == 1) return 1;
		if (n == 2) return 2;

		int one_step = 1;
		int tow_steps = 2;
		int all_ways = 0;

		for (int i = 2; i < n; i++) {
			all_ways = one_step + tow_steps;
			one_step = tow_steps;
			tow_steps = all_ways;
		}
		return all_ways;
	}

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}

}
