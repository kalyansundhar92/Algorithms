package main.java.arrayandstring;


import java.util.ArrayDeque;
import java.util.Queue;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

    }


}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Queue<Integer> firstQueue = new ArrayDeque<>();
        for(int i=0 ; i<m ; i++) {
            firstQueue.add(nums1[i]);
        }

        Queue<Integer> secondQueue = new ArrayDeque<>();
        for(int j=0; j<n ; j++) {
            secondQueue.add(nums2[j]);
        }

        int k = 0;
        while(firstQueue.size() > 0 || secondQueue.size() > 0) {
            if(firstQueue.isEmpty()) {
                nums1[k] = secondQueue.poll();
            } else if(secondQueue.isEmpty()) {
                nums1[k] = firstQueue.poll();
            } else {
                if(firstQueue.element() < secondQueue.element()) {
                    nums1[k] = firstQueue.poll();
                } else {
                    nums1[k] = secondQueue.poll();
                }
            }
            ++k;
        }
    }
}

