package main.java.arrayandstring;

import java.util.Stack;

public class ValidParanthesis {

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0 ; i < s.length() ; i++) {
                if(s.charAt(i) == '(') {
                    stack.push(')');
                } else if (s.charAt(i) == '{' ) {
                    stack.push('}');
                } else if (s.charAt(i) == '[') {
                    stack.push(']');
                } else {
                    if (!stack.isEmpty() && stack.pop() == s.charAt(i)) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
            return stack.empty() && true;
        }
    }
}
