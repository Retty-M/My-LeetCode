package String;

/**
 * Created by Retty on 2016-04-10.
 */
public class Solution151 {

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        String[] sArr = s.trim().split(" +");
        int len = sArr.length;
        if (len <= 0) return s;
        s = "";
        for (int i = len-1; i > 0; --i) {
            s += sArr[i] + " ";
        }
        s += sArr[0];
        return s;
    }

    public static void main(String[] args) {
        String s = "a   b";
        System.out.println(s.trim());
        String[] arr = s.trim().split(" +");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(reverseWords(s));
    }

}
