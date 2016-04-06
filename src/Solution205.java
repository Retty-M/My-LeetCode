/**
 * Created by Retty on 2016-03-20.
 */
import java.util.HashMap;
import java.util.Map;

public class Solution205 {
	
	public boolean isIsomorphic(String s, String t) {	
		if (s.length() != t.length()) return false;
		if (s==null || t==null) return false;
		if (mapped(s, t)) {
			if (mapped(t, s)) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
    }
	
	public boolean mapped(String s1, String s2) {
		Map<Character, Character> map = new HashMap<>(); 
        for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if(map.containsKey(c1)) {  
                if(map.get(c1) != c2) return false;  
            } else {  
            	map.put(c1, c2);   
            }   
		}
        return true;
	}
}
