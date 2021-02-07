package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList <Integer> listA= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        listA.stream().filter((s)->s>1).forEach(System.out::println);
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }



}
