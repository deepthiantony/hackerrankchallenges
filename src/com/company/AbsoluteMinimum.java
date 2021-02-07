package com.company;

public class AbsoluteMinimum {
    public static int absoluteMinimum(int[] array) {
        int n = array.length;
        int minimum = Math.abs(array[0] - array[1]);
        int min;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                min = Math.abs(array[i] - array[j]);
                if (minimum > min) {
                    minimum = min;
                }
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] array = {3, -7, 0};
        System.out.println(absoluteMinimum(array));
    }
}
