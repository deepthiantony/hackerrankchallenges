package com.company;

public class Pyramids1 {
    static void staircase(int n) {
        int i, j;
        for (i = 0; i < n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (j =(n-i-1); j >= 0; j--) {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print("#");
            }

            // ending line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
