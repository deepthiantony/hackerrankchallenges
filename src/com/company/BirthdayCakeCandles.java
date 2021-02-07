package com.company;

import java.util.*;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallest = 0;
        int count = 0;
        int ct=1;
        for (int i : candles) {
            if (candles.get(i) > tallest) {
                tallest = candles.get(i);
            }
        }
            Map<Integer, Integer> forCount = new HashMap<>();
            for (int c : candles) {
                if(forCount.containsKey(candles.get(c)) )
                    ct+=1;
                forCount.put(candles.get(c), (ct));
            }
            for (Map.Entry<Integer, Integer> entry : forCount.entrySet()) {
                if (tallest == entry.getKey()) {
                    count= entry.getValue();
                }
                // do something with key and/or tab
            }

return count;

    }

    public static void main(String[] args) {
        List<Integer> h=new ArrayList<>(Arrays.asList(3,2,1,3));
        System.out.println(birthdayCakeCandles(h));
    }
}
