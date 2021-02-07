package com.company;

import java.util.Arrays;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int minSum=0,maxSum=0;
        for(int i=1;i<arr.length;i++){
            minSum=minSum+arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            maxSum=maxSum+arr[i];
        }
        System.out.println(minSum+" "+maxSum);

    }

    public static void main(String[] args) {
        int [] a={1,2,3,4};
        miniMaxSum(a);
    }
}
