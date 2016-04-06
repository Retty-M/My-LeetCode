package Sorting;

/**
 * Created by Retty on 2016-03-28.
 * 冒泡排序：两两比较，如果后者较小交换顺序，每次比较的次数都在减小
 */
public class Bubble {

    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {9,8,7,6,5,4,3,2,1};
        bubble(test);
        for (int i : test) {
            System.out.printf(i + "");
        }
    }

}
