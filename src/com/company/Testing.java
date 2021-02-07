package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {

    public static int solution(int[] juice, int[] capacity) {
        int maxDiff = 0, maxNum, count = 1;
        for (int i = 0; i < juice.length; i++) {
            if (maxDiff < (capacity[i] - juice[i])) {
                maxDiff = capacity[i] - juice[i];
            }
        }
        Arrays.sort(juice);
        for (int i = 0; i < juice.length; i++) {
            maxDiff = maxDiff - juice[i];
            if (maxDiff >= 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] juice = {2,3};
        int[] capacity = {3,4};
        System.out.println(solution(juice, capacity));
    }

}

