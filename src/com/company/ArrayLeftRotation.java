package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLeftRotation {
//    private static List<Integer> rotateLeft(int d, List<Integer> arr) {
////        arr.stream().map(q-> Collections.)
//
//    }

    public static void main(String[] args) {
        Integer [] a={1,2,3,4,5};
        List<Integer> arr= new ArrayList<Integer>(Arrays.asList(a));
        int d=2;
        List<Integer> newArray=new ArrayList<Integer>(a.length);
//        newArray=rotateLeft(d,arr);
        for (Integer i:newArray) {
            System.out.println(i);
        }
    }
}