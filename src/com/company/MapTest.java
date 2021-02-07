package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<Integer,String> testMap=new HashMap<>();
        testMap.put(1,"Rachel");
        testMap.put(2,"Deeps");
        testMap.computeIfAbsent(3,k->"Lino"+"Jacob");
        testMap.entrySet().forEach(k-> System.out.println(k.getKey()+" "+k.getValue()));
    }
}
