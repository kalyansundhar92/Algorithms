package main.java.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

    }
}

class Solution2 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n : nums) {
            if(i < 2 && n > nums[i-2]) {
                nums[i++] = n;
            }
        }

        return i;
    }
}
