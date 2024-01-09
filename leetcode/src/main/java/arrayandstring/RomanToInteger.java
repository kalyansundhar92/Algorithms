package main.java.arrayandstring;

public class RomanToInteger {

    class Solution {
        public  int romanToInt(String s) {
            int total = 0;
            int length = s.length();
            for(int i=0 ; i < length ; i++) {
                if(s.charAt(i) == 'M') {
                    total += 1000;
                } else if (s.charAt(i) == 'D') {
                    total += 500;
                } else if (s.charAt(i) == 'C') {
                    if(i+1 < length &&  s.charAt(i+1) == 'M') {
                        total += 900;
                        i += 1;
                    } else if (i+1 < length && s.charAt(i+1) == 'D') {
                        total += 400;
                        i += 1;
                    } else {
                        total += 100;
                    }
                } else if (s.charAt(i) == 'L' ) {
                    total += 50;
                } else if (s.charAt(i) == 'X') {
                    if (i+1 < length && s.charAt(i+1) == 'L') {
                        total += 40;
                        i += 1;
                    } else if (i+1 < length && s.charAt(i+1) == 'C') {
                        total += 90;
                        i += 1;
                    } else {
                        total += 10;
                    }
                } else if (s.charAt(i) == 'V') {
                    total += 5;
                } else if (s.charAt(i) == 'I') {
                    if(i+1 < length && s.charAt(i+1) == 'V') {
                        total += 4;
                        i += 1;
                    } else if (i+1 < length && s.charAt(i+1) == 'X') {
                        total += 9;
                        i += 1;
                    } else {
                        total += 1;
                    }
                }
            }

            return total;
        }
    }
}
