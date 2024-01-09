package main.java.arrayandstring;

public class RemoveUnwantedElements {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] nums = {3,3};

        solution1.removeElement(nums, 3);
    }
}

class Solution1 {
    public int removeElement(int[] nums, int val) {
            int index=0;
            for(int i = 0 ; i < nums.length ; i++) {
                if(nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }

            return index;
    }
}
