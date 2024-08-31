package ru.netology;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected String address;
    protected OptionalInt age;

    public Person(String name, String surname, OptionalInt age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = adress;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setAge(0)
                .setSurname(this.surname)
                .setAddress(this.address);
    };

    public boolean hasAge() {
        return Objects.isNull(this.age);
    }

    public boolean hasAddress() {
        return Objects.isNull(this.address);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    public void happyBirthday() {
        age = OptionalInt.of(age.getAsInt() + 1);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("name: "+this.name+"\n");
        stringBuilder.append("surname: "+this.surname+"\n");
        stringBuilder.append("age: "+this.age.getAsInt()+"\n");
        stringBuilder.append("address: "+this.address +"\n");

        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age.hashCode() + surname.hashCode() + address.hashCode();
    }
}
