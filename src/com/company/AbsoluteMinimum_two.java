package com.company;

import java.util.Arrays;

public class AbsoluteMinimum_two {
    public static int absoluteMinimum(int[] array) {
        int n = array.length;
        int minAbsDiff = Math.abs(array[0] - array[1]);
        int absDiff;
        Arrays.sort(array);
        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
            absDiff = Math.abs(array[i] - array[i + 1]);
            if (minAbsDiff > absDiff) {
                minAbsDiff = absDiff;
            }
//            }
        }
        return minAbsDiff;
    }

    public static void main(String[] args) {
        int[] array = {3, -7, 0};
        System.out.println(absoluteMinimum(array));
    }
}
