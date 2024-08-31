package ru.netology;


public class Main {
    public static void main(String[] args) {
        Person person =new PersonBuilder()
                .setAge(12)
                .setName("12")
                .setAddress("12")
                .setSurname("12")
                .build();
        System.out.println(person);


    }
}