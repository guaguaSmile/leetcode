package main.java.arr;

/**
 * 查找有序数组中的值，如果有返回索引，如果没有插入该值并返回索引
 * eg: [1,3,4,5] 输入 4 返回索引2，输入2，返回索引 1
 */
public class ArrInsert {


    public static int getIndex(int[] nums, int v) {
        int index = 0;
        boolean has = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == v) {
                has =true;
                index = i;
            }
        }
        if (has) {
            return index;
        }
        index = insert(nums, v);

        return index;
    }

    public static int insert(int[] nums, int v) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (v < nums[i]) {
                int temp = nums[i];
                nums[i] = v;
                nums[i + 1] = temp;
                index = i;
            } else {
                nums[nums.length] = v;
                index = nums.length;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5};
        int index = getIndex(nums, 2);
        System.out.println(index);
    }
}
