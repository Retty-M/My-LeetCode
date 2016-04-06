/**
 * Created by Retty on 2016-03-20.
 */
import java.util.Arrays;

public class Solution242 {
	
	public boolean isAnagram(String s, String t) {
		
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		
		return String.valueOf(sArr).equals(String.valueOf(tArr));
			
		/*if (s.length() != t.length()) {
			return false;
		}
		for (int i = 0; i < t.length(); i++) {
			int index = s.indexOf(t.charAt(i));
			if (index >= 0) {
				s = s.substring(0, index) + s.substring(index+1);
			} else {
				return false;
			}
		}
		return true;*/
	}
	
}
