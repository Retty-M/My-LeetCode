/**
 * Created by Retty on 2016-03-20.
 */
import java.util.Arrays;

public class Solution299 {

	public String getHint(String secret, String guess) {
		int A = 0;
		int B = 0;
        char[] sArr = secret.toCharArray();
        char[] tArr = guess.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
			if (sArr[i] == tArr[i]) {
				A++;
				sArr[i] = 'a';
				tArr[i] = 'b';
			}
        }
        char[] sorted = sArr.clone();
        for (int j = 0; j < tArr.length; j++) {
        	Arrays.sort(sorted);
			int index = Arrays.binarySearch(sorted, tArr[j]);
			System.out.println(index);
			if (index >= 0) {
				B++;
				sorted[index] = ' ';
			}
		}
        
        return A+"A"+B+"B";
    }
	
}
