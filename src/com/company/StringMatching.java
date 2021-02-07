package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class StringMatching {
    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> sMap = new HashMap<>(strings.length);
        List<Integer> matchList = new ArrayList<>();
        int[] occurance = new int[queries.length];
        for (int i = 0; i < strings.length; i++) {
            if (!sMap.containsKey(strings[i])) {
                sMap.put(strings[i], 1);
            } else {
                Integer currentCount = sMap.get(strings[i]);
                sMap.put(strings[i], currentCount + 1);
            }
        }
        for (int j = 0; j < queries.length; j++) {
            if (sMap.containsKey(queries[j])) {
                occurance[j] = sMap.get(queries[j]).intValue();
            } else {
                occurance[j] = 0;
            }
        }
        return occurance;

    }

    public static void main(String[] args) {
        String[] strings = {"ab", "ab", "abc"};
        String[] queries = {"ab", "abc", "bc"};
        matchingStrings(strings, queries);

//   List<String> stringList = Arrays.asList(strings);
//         List<String> queryList = Arrays.asList(queries);
//        List<Integer> outputList=queryList.stream().map(q->Collections.frequency(stringList,q)).collect(Collectors.toList());
//       outputList.toArray();
//        for (int i = 0; i < outputList.size(); i++) {
//
//    }         System.out.println(outputLis);
        }
}
