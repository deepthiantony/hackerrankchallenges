package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Porche");
        cars.add("Maruti");
//        Iterator<String> it = cars.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        for(String st:cars){
            System.out.println(st);
        }
    }
}
