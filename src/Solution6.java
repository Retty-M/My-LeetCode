/**
 * Created by Retty on 2016-03-20.
 */
public class Solution6 {

	public String convert(String s, int numRows) {
		int length = s.length();
        if(length <= numRows || numRows <= 1) return s;
        int number = 2*numRows - 2;
        String result = "";
        for (int i = 0; i < numRows; i++) {
        	int index = i;
			while(index < length) {
				result += s.charAt(index);
				System.out.print(s.charAt(index));
				if (0 < i && i < numRows-1 && index + number - 2*i < length) {
					result += s.charAt(index + number - 2*i);
					System.out.print(index + number - 2*i);
				}
				index += number;
			}
		}
        return result;
    }
	
}
