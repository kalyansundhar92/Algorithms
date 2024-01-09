package main.java.arrayandstring;

public class MajorityElement {

    public static void main(String[] args) {

    }
}
// Condition is to solve the problem in linear time and O(1) space
/*
if space is not a constraint usual method to solve this problem is to use a hashmap
keep a count of variables and finally calling out the element with most count.

Following way is a method to solve the same problem in linear time and O(1) space complexity.
 */
class Solution3 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for(int n : nums) {
            if(count == 0) {
                element = n;
            }

            if(element == n) {
                ++count;
            }else {
                --count;
            }
        }

        return element;
    }
}
