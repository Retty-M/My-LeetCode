/**
 * Created by Retty on 2016-03-20.
 */
import java.lang.Math;

public class Solution171 {
	
	public int titleToNumber(String s) {
		int num = 0;
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++)
        
        {
			int index = String.valueOf(sArr[i]).compareToIgnoreCase("A") + 1;
			num += index * Math.pow(26, (sArr.length-1-i));
        }
        return num;
    }
	
}
