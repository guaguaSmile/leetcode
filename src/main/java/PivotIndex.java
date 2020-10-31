package main.java;

/**
 * 求数组的中心索引,中心索引两边的和值相等
 * eg: [1,3,7,6,5,6] 1+3+7 = 11 ，5+6=11 中心索引的位置为：3
 */
public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        if (nums.length <= 1) {
            return -1;
        }
        int sum = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        // 处理
        if (sum == nums[0]) {
            return 0;
        }
        System.out.println(sum);
        for (int i = 1; i < nums.length; i++) {
            left += nums[i-1];
            right = sum - left - nums[i];
            if (right == left) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 3, 7, 6, 5, 6};
        int[] nums = {-1,1,0,1,-1};
        int index = pivotIndex(nums);
        System.out.println(index);
    }
}
