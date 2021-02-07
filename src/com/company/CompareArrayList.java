package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareArrayList {
    public static void main(String args[]) {
        ArrayList<String> arrayA = new ArrayList<String>(Arrays.asList("d", "b", "a"));
        ArrayList<String> arrayB = new ArrayList<String>(Arrays.asList("a", "b", "e"));
        ArrayList<String> arrayC = new ArrayList<String>(Arrays.asList("a", "b", "d"));
        Collections.sort(arrayA);
        Collections.sort(arrayB);
        Collections.sort(arrayC);
        System.out.println(arrayA.equals(arrayB));
        arrayA.add("bn");
        arrayA.addAll(arrayC);
        Object [] array=arrayA.toArray();

        for (int i = 0; i < arrayA.size(); i++) {
            System.out.println( array[i]);
        }
//
//        arrayA.forEach(x-> System.out.println(x.toUpperCase()));
//        System.out.println(arrayA.indexOf("A"));


    }


}
