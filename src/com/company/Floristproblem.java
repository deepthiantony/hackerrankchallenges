package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Floristproblem {
    public static int getMinimumCost(int k, int[] c) {
        int n = c.length;
        int minCost = 0;
        int tempCount = 0;
        int previousPurchases = 0;


        if(k >= n){
            for(int i = 0; i < n; i++)
                minCost += c[i];
        }
        else{
            for(int i = n - 1; i >= 0; i--){
                if(tempCount == k){
                    tempCount = 0;
                    previousPurchases++;
                }
                minCost += (previousPurchases + 1) * c[i];
                tempCount++;
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
int k=3;
int []c= {1, 3, 5, 7, 9};
        System.out.println(getMinimumCost(k,c));
    }
}
