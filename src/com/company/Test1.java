package com.company;

import java.util.*;

class Test1 {
    public static int solution(int[] A, int[] B) {
        Map<Integer, Integer> coordinatesMap = new HashMap<>();
        int maxCount = 0, max;
        if (A.length == B.length) {
            for (int i = 0; i < A.length; i++) {
                int length = A[i];
                int breadth = B[i];
                Integer count = coordinatesMap.get(length);
                count = count == null ? 1 : count + 1;
                coordinatesMap.put(length, count);
                if (maxCount < count) {
                    maxCount = count;
                }
                if (length != breadth) {
                    count = coordinatesMap.get(breadth);
                    count = count == null ? 1 : count + 1;
                    coordinatesMap.put(breadth, count);
                    if (maxCount < count) {
                        maxCount = count;
                    }
                }
            }
        }
        return maxCount;

    }

    public static void main(String[] args) {
        int[] A = {2};
        int[] B = {3};
        System.out.println(solution(A, B));
    }
}




