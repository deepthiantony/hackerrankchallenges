package com.company;

public class SingletonExample {
    private static SingletonExample objectInstance;
    private SingletonExample()
    {

    }
    public static SingletonExample getInstance(){
        if(objectInstance==null){
            objectInstance=new SingletonExample();
            return objectInstance;
        }
        return null;
    }

}
