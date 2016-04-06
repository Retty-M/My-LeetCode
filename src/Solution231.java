/**
 * Created by Retty on 2016-03-20.
 */
public class Solution231 {
	
	public boolean isPowerOfTwo(int n) {
		double a = Math.log10(n)/Math.log10(2);
		int b = (int)a;
		return a==b;
    }
	
}
