package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // Student st=new Student();
        Age age=new Age();
        age.setDay(01);
        age.setMonth(11);
        age.setYear(2000);
        Student st=new Student(1,"Rachel",age);
        age.setYear(2010);
        System.out.println(st.getAge().getYear());
    }
}
