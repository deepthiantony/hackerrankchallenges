package com.company;

import java.util.HashMap;
import java.util.Map;

public class NonIntersectingNumbers2 {
    public static int nonIntersectingNumbers(int[] A) {
        int maxNum = 0;
        Map<Integer, Integer> numbers = new HashMap<>();
        int sum1 = 0;
        int sum2 = 0;
        int count = 1;
        int lastSum=0;
        for (int i = 0; i < A.length - 2; i++) {
            sum1 = A[i] + A[i + 1];
            sum2 = A[i + 1] + A[i + 2];
            if (sum1 != sum2 && (i!=A.length-3)) {
                if (numbers.containsKey(sum1)) {
                    numbers.put(sum1, count + 1);
                } else {
                    numbers.put(sum1, count);
                }
            }
            else{
                    if (numbers.containsKey(sum2)) {
                        numbers.put(sum2, numbers.get(sum2)+1);
                    } else {
                        numbers.put(sum2, count);
                    }
                }

        }

        for(int i :numbers.values())
    {

        if (i > maxNum) {
            maxNum = i;
        }

    }
        return maxNum;
}

    public static void main(String[] args) {
        int[] A = {1,2,1,0,0};
                //{1, 2, 1, 3, 0, 0, 3};
        //{1,2,1,0,0};
        //
        //{10,1,3,1,2,2,1,0,4};
         System.out.println(nonIntersectingNumbers(A));
    }
}
