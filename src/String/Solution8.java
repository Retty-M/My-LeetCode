package String;

/**
 * Created by Retty on 2016-04-10.
 * String to Integer (atoi)
 * 需要考虑边界条件：
 * 1、字符串为空或null，空格，和正负号
 * 2、当字符串的数字大于Int的范围时，要做处理
 */
public class Solution8 {

    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0;
        int sign = 1, base = 0, i = 0;
        char[] strArr = str.toCharArray();
        while (strArr[i] == ' ') {
            i++;
            if (i == strArr.length) return 0;
        }
        if (strArr[i] == '-') {
            sign = -1;
            i++;
        } else if (strArr[i] == '+') i++;
        for (; i < strArr.length; i++) {
            if (strArr[i] >= '0' && strArr[i] <= '9') {
                if (base > Integer.MAX_VALUE/10 || (base == Integer.MAX_VALUE/10 && strArr[i]-'0' > 7)) {
                    if (sign == 1) return Integer.MAX_VALUE;
                    else return Integer.MIN_VALUE;
                }
                base = base * 10 + (strArr[i] - '0');
            } else break;
        }
        return base*sign;
    }

    public static void main(String[] args) {
        String str = "1111111111111";
        System.out.println(myAtoi(str));
    }

}
