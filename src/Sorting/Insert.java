package Sorting;

/**
 * Created by Retty on 2016-03-28.
 * 插入排序：从第二个数开始，在左边合适的位置插入
 */
public class Insert {

    public static void inser(int[] nums) {
        int insertNum;
        for (int i = 1; i < nums.length; i++) {
            insertNum = nums[i];
            int j = i - 1;
            // 如果左边数大于插入数，循环右移
            while (j >= 0 && nums[j] > insertNum) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        int[] test = {9,8,7,6,5,4,3,2,1};
        inser(test);
        for (int i : test) {
            System.out.printf(i + "");
        }
    }

}
