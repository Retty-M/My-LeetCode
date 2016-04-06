package Sorting;

/**
 * Created by Retty on 2016-04-03.
 * 基数排序：创建10行目标数组大小为列数的二维数组，然后从个位开始
 * 向高位依次存取，最高位完成后即为顺序排列，必须预先知道最大数位数
 */
public class Radix {

    public static void radixSort(int[] nums, int digit) {
        int n = 1;
        int currentDigit = 1;
        int[][] temp = new int[10][nums.length];
        int[] order = new int[10];
        while (currentDigit <= digit) {
            for (int i = 0; i < nums.length; i++) {
                int lsd = (nums[i]/ n) % 10;
                temp[lsd][order[lsd]] = nums[i];
                order[lsd]++;
            }
            int k = 0;
            for (int i = 0; i < 10; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        nums[k] = temp[i][j];
                        k++;
                    }
                }
                order[i] = 0;
            }
            n *= 10;
            currentDigit++;
        }
    }

    public static void main(String[] args) {
        int[] test = {9,8,7,6,5,4,3,2,1,1,99};
        radixSort(test, 2);
        for (int i : test) {
            System.out.printf(i + "");
        }
    }

}
