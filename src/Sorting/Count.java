package Sorting;

/**
 * Created by Retty on 2016-04-03.
 * 计数排序：记录给定元素中的最大值和最小值生成一个数组，利用Index
 * 记录每个元素出现的次数，最后再遍历输出
 * 稳定的排序算法，时间复杂度为O(n)
 */
public class Count {

    public static void countSort(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i : nums) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int[] countArr = new int[max-min+1];
        for (int i = 0; i < nums.length; i++) {
            countArr[nums[i] - min] += 1;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (countArr[index] == 0) index++;
            nums[i] = index + min;
            countArr[index]--;
        }
    }

    public static void main(String[] args) {
        int[] test = {9,8,7,6,5,4,3,2,1,1,9};
        countSort(test);
        for (int i : test) {
            System.out.printf(i + "");
        }
    }

}
