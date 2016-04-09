package Array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Retty on 2016-04-05.
 */
public class Solution60 {

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; --i) {
            result *= i;
        }
        return result;
    }

    public static String getPermutation(int n, int k) {
        List<Integer> list = new LinkedList<>();
        String s = "";
        for (int i = 0; i < n; i++) list.add(i+1);
//        System.out.println(list.get(3));
//        list.remove(3);
//        System.out.println(list.get(3));
        int num = k-1;
        int base = factorial(n-1);
        System.out.println(base);
        for (int i = n-1; i >= 0; --i) {
            int index = num / base;
            s += list.get(index);
            list.remove(index);
            num %= base;
            if (i != 0) base /= i;
        }
        return s;
    }

    public static void main(String[] args) {
        String s = getPermutation(3,6);
        System.out.print(s);
    }

}
