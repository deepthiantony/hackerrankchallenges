package com.company;

 public final class Student {
     private final int rollNo;
    private final String name;
    private final Age age;

    public Student(int rollNo,String name,Age age) {
        this.rollNo=rollNo;
        this.name=name;
        Age cloneAge=new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age=cloneAge;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age cloneAge=new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }
}
