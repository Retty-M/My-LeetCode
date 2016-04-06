/**
 * Created by Retty on 2016-03-20.
 */
import java.math.BigDecimal;

public class Solution70 {
	
	public int climbStairs(int n) {
		BigDecimal ways = new BigDecimal(0);
        int numbersOf2 = 1;
        while (n > 2*numbersOf2) {
        	ways = ways.add((factorial(n-numbersOf2).divide(factorial(numbersOf2))).divide(factorial(n-2*numbersOf2)));
        	numbersOf2++;
		}
        return n%2 == 0 ? ways.intValue()+2 : ways.intValue()+1;
    }
	
	public static BigDecimal factorial(int n){   
		BigDecimal result = new BigDecimal(1);
		BigDecimal a;  
		for(int i = 2; i <= n; i++){  
		    a = new BigDecimal(i);
		    result = result.multiply(a);
		}  
		return result;  
	}  

}
