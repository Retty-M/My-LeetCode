/**
 * Created by Retty on 2016-03-20.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution290 {

	public boolean wordPattern(String pattern, String str) {
		char[] pArr = pattern.toCharArray();
        String[] sArr = str.split(" ");
//        System.out.println(pArr.length);
//        System.out.println(sArr.length);
        if (pArr.length != sArr.length) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pArr.length; i++) {        	
			if (map.containsKey(pArr[i])) {
				if (!map.get(pArr[i]).equals(sArr[i])) return false;
			}else {
				if (set.contains(sArr[i])) {
					return false;
				} else {
					map.put(pArr[i], sArr[i]);
					set.add(sArr[i]);
				}
			}
//			System.out.println(map);
		}
        return true;
    }
	
}
