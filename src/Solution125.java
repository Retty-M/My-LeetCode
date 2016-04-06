/**
 * Created by Retty on 2016-03-20.
 */
public class Solution125 {

	public boolean isPalindrome(String s) {
        char[] sArr = s.toLowerCase().toCharArray();
        int length = sArr.length;
        if (length < 1) return true;
        int i = 0;
       	int j =length -1;
		while (i<j) {
			while(i<j && !isValid(sArr[i])) i++;
			while(i<j && !isValid(sArr[j])) j--;
			if(i<j && sArr[i] != sArr[j]) {
				return false;
			}
			i++;
			j--;
		} 
		return true;
    }
	
	public boolean isValid(char c) {
		if (c >= 'a' && c <= 'z') return true;
		if (c >= '0' && c <= '9') return true;
		return false;
	}
	
}
