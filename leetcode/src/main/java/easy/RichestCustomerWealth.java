package main.java.easy;

import java.util.Arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        int temp = 0 ;
        for(int i=0 ; i < accounts.length ; i++) {
            temp = Arrays.stream(accounts[i]).sum();
            result = Math.max(temp, result);
        }
        return result;
    }

    public int maximumWealthSolution2(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        int temp = 0 ;
        for(int i=0 ; i < accounts.length ; ++i) {
            temp=0;
            for(int j=0 ; j< accounts[i].length ; ++j){
                temp += accounts[i][j];
            }
            if(temp > result){
                result = temp;
            }
        }
        return result;
    }

    //java8
    public int maximumWealthSolution3(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt();
    }
}
