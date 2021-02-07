package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SortingArrray1 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int t = i;
                while (arr[t] != i + 1) {
                    t = t + 1;
                }
                tmp = arr[t];
                arr[t] = arr[i];
                arr[i] = tmp;
                count++;
            }
        }

        return count;
    }



    public static void main(String[] args) throws IOException {
    int [] a={2,3,5,1,6};
    int count=minimumSwaps(a);
        System.out.println(count);
 }
}

