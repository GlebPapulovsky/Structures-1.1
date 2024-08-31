package ru.netology;

import java.util.OptionalInt;

public class PersonBuilder {
    private String name;
    private String surname;
    private OptionalInt age;
    private String address;



    //констректоры
    PersonBuilder(){};

    PersonBuilder(String name,String surname,OptionalInt age,String address) {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.address = address;
    }


    //setters
    public PersonBuilder setName(String name) {
        this.name = name;
        return new PersonBuilder(this.name,this.surname,this.age,this.address);
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return new PersonBuilder(this.name,this.surname,this.age,this.address);
    }

    public PersonBuilder setAge(int age) {
        this.age = OptionalInt.of(age);
        return new PersonBuilder(this.name,this.surname,this.age,this.address);
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return new PersonBuilder(this.name,this.surname,this.age,this.address);
    }

    public Person build() {
        return new Person(this.name,this.surname,this.age,this.address);
    }
}
