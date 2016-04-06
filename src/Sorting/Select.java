package Sorting;

/**
 * Created by Retty on 2016-03-28.
 * 选择排序：向后遍历选择最小的值，与起始值互换，记录的是Index
 */
public class Select {

    public static void select (int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[i]) min = j;
            }
            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {9,8,7,6,5,4,3,2,1};
        select(test);
        for (int i : test) {
            System.out.printf(i + "");
        }
    }

}
