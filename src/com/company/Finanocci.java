package com.company;

public class Finanocci {
    public static void main(String[] args) {
        fibannocci(6);
    }

    private static void fibannocci(int n) {
        int previousnum = 0;
        int nextnumber = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(previousnum);
            int sum = previousnum + nextnumber;
            previousnum = nextnumber;
            nextnumber = sum;
        }
    }
}



