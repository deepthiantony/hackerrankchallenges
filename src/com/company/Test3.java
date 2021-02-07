package com.company;

import java.util.Calendar;

public class Test3 {
    public static void findDay(int month, int day, int year) {
        Calendar cal=Calendar.getInstance();
        cal.set(year,month,day);
        int n=cal.get(Calendar.DAY_OF_WEEK);
        String s[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(s[n]);
    }
    public static void main(String[] args) {
int month=2;
int day=7;
int year=2021;
findDay(month,day,year);
    }
}
