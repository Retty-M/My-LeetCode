package Array;

/**
 * Created by Retty on 2016-03-27.
 */
public class Solution31 {

//    public void nextPermutation(int[] nums) {
//        for (int i = nums.length-2; i >= 0; i--) {
//            if (nums[i] < nums[i+1]) {
//                if (i == nums.length-2) {
//                    int temp = nums[i];
//                    nums[i] = nums[i+1];
//                    nums[i+1] = temp;
//                    break;
//                } else {
//                    List<Integer> newNums = new ArrayList<>();
//                    int[] sortNum = Arrays.copyOfRange(nums, i, nums.length);
//                    Arrays.sort(sortNum);
//                    for (int j = 0; j < sortNum.length; j++) {
//                        newNums.add(sortNum[j]);
//                    }
//                    int index = newNums.indexOf(nums[i])+1;
//                    while (newNums.get(index).equals(newNums.get(index-1))) index++;
//                    nums[i] = newNums.get(index);
//                    newNums.remove(index);
//                    for (int j = i+1; j < nums.length; j++) {
//                        nums[j] = newNums.get(j-i-1);
//                    }
//                    break;
//                }
//            } else if (i == 0) Arrays.sort(nums);
//        }
//    }

    public void nextPermutation(int[] nums) {
        if(nums.length<=1){
            return;
        }

        int i= nums.length-1;

        for(;i>=1;i--){

            if(nums[i]>nums[i-1]){ //find first number which is smaller than it's after number
                break;
            }
        }

        if(i!=0){
            swap(nums,i-1); //if the number exist,which means that the nums not like{5,4,3,2,1}
        }

        reverse(nums,i);
    }

    private void swap(int[] a,int i){
        for(int j = a.length-1;j>i;j--){
            if(a[j]>a[i]){
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
                break;
            }
        }
    }

    private void reverse(int[] a,int i){//reverse the number after the number we have found
        int first = i;
        int last = a.length-1;
        while(first<last){
            int t = a[first];
            a[first] = a[last];
            a[last] = t;
            first ++;
            last --;
        }
    }

}
