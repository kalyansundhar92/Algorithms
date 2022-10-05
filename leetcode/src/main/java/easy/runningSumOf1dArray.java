package main.java.easy;

import java.util.Arrays;

public class runningSumOf1dArray {
    //my solution
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length ; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    //givenSolution
    public int[] runningSumSolution2(int[] nums) {
        int[] result = new int[nums.length];
            result[0] = nums[0];
        for(int i = 1; i < nums.length ; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }

    //best solution
    public int[] runningSumSolution3(int[] nums) {
        int i = 1;
        while (i<nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
    }
}
