package main.java.arrayandstring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;



public class FizzBuzz {


    enum Values {
            Fizz,Buzz,FizzBuzz;
    }

    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            IntStream.rangeClosed(1,n).forEach(value -> {
                boolean threeDiv = false, fivDiv = false;
                threeDiv = value % 3 == 0;
                fivDiv = value % 5 == 0;

                if(threeDiv && fivDiv) {
                    result.add("FizzBuzz");
                } else if (threeDiv) {
                    result.add("Fizz");
                } else if (fivDiv) {
                    result.add(Values.Buzz.name());
                } else {
                    result.add(String.valueOf(value));
                }
            });
            return result;
        }
    }
}
