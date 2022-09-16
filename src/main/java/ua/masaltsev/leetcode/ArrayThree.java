package ua.masaltsev.leetcode;

public class ArrayThree {
    public void rotate(int[] nums, int k) {

        int length = nums.length;
        int targetIndex;
        int[] resultArray = new int[length];
        k = k % length;

        for (int i = 0; i < length; i++) {
            targetIndex = i + k;
            if (targetIndex > length - 1) {
                targetIndex = targetIndex - length;
            }
            resultArray[targetIndex] = nums[i];
        }

        System.arraycopy(resultArray, 0, nums, 0, nums.length);
        /*int length = nums.length;
        int buffer;
        k = k % length;

        for (; k != 0; k--) {
            for (int i = 0; i < length; i++) {
                if (i == length - 1) {
                    nums[0] = nums[i];
                } else {
                    buffer = nums[i + 1];
                    nums[i + 1] = nums[i];
                }
            }
        }*/
    }
}
