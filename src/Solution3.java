/**
 * Created by Retty on 2016-03-20.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {

	public int lengthOfLongestSubstring(String s) {
		if(s == null) return 0;
		int num = 0;
		int max = 0;
        char[] sArr = s.toCharArray();
//        List<Character> temp = new ArrayList<>();
        Map<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
			if(temp.containsKey(sArr[i])) {
				num = Math.max(num, temp.get(sArr[i]) + 1);
			}
			temp.put(sArr[i], i);
			max = Math.max(num, i-num+1);
		}
        return max;
    }
	
}
