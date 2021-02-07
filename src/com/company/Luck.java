package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Luck {
    public static int luck(int[][] a, int k) {
        int sum = 0;
        int Luck=0;
        List<Integer> heap = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i][0];
            if(a[i][1]==1){
                heap.add(a[i][0]);
            }
        }

        if(heap.size()>k) {
            int n=heap.size()-k-1;
            Collections.sort(heap);
           while(k>-1) {
                sum = sum - 2*heap.get(n);
                n--;
            }
        }
        return sum;


    }

    public static void main(String[] args) {
        int [] [] contents =new int[5][2];
        contents[0][0] = 5;
        contents[0][1] = 1;
        contents[2][0] = 2;
        contents[2][1] = 1;
        contents[3][0] = 1;
        contents[3][1] = 1;
        contents[4][0] = 8;
        contents[4][1] = 1;
        contents[5][0] = 10;
        contents[5][1] = 0;
        contents[6][0] = 5;
        contents[6][1] = 0;
        int k=1;

        System.out.println(luck(contents,k));
    }
}
