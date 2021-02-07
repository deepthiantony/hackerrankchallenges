package com.company;

public class Student {
    private final Long id;
    private final String name;
    private final Address address;
    private final Age age;

    public Student(Long id, String name, Address address, Age age) {
        this.id = id;
        this.name = name;
        Age age1=new Age();
        age1.setYear(age.getYear());
        age1.setDay(age.getDay());
        age1.setMonth(age.getMonth());
        this.age=age1;
        Address cloneAddress=new Address();
        cloneAddress.setAddress1(address.getAddress1());
        cloneAddress.setAddress2(address.getAddress2());
        this.address = cloneAddress;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Age getAge() {
        Age cloneAge=new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;

    }
}
