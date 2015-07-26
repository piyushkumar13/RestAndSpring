package com.piyush.domain.spring.FactoryExample;

public class SingletonClass {

    private static final SingletonClass singleObj = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getSingleObj() {
        return singleObj;
    }

    public SingletonClass getSingleObjFromInstance() {
        return singleObj;
    }

    public void printSomeString() {
        System.out.println("This is the singleton class");
    }

    public static Person getPersonObj() {

        Person person = new Person("1", "Piyush", "Delhi - Paschim Vihar");
        return person;
    }

    public Person getPersonObjFromInstanceObj() {
        Person person = new Person("2", "ABC", "XYZ");
        return person;
    }
}
