package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxNonIntersectingNumbers {
    public static int MaxNonIntersectingNumbers(int[] A) {
        int n = A.length;
        List<Integer> array=new ArrayList<>();
        int oldSum=0;
        int sum = 0;
        int cnt = 1;
        int max = 0;
        int maxNum = 0;
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int k=0;k<n-1;k++){
            oldSum=A[k]+A[k+1];
            array.add(oldSum);
        }

        for (int i=0;i<array.size()-1;i++) {
            if((array.get(i)!= array.get(i+1))) {
                if (numbers.containsKey(array.get(i))) {
                    numbers.put(array.get(i), cnt + 1);
                } else {
                    numbers.put(array.get(i), cnt);
                }
            }
            numbers.put(array.get(i+1),cnt );

        }
        for (int i : numbers.values()) {

            if (i > max) {
                max = i;
            }
            maxNum = max;
        }
        return maxNum;

    }

    public static void main(String[] args) {
        int[] A = {1,2,1,0,0};
                //{1,2,1,0,0};
               //
                //{10,1,3,1,2,2,1,0,4};
        System.out.println(MaxNonIntersectingNumbers(A));
    }
}
