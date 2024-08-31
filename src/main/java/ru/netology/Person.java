package ru.netology;

public class Person {
    private   String name;
    private   String surName;
    private int age;
    private String adres;

    private boolean hasAge=false;
    private boolean hasAdres=false;







    //getters
    public String getSurName(){
        return this.surName;
    }

    public int getAge() {
        return age;
    }

    public String getAdres() {
        return adres;
    }
    public String getName(){
        return this.name;
    }

    //
    public boolean hasAge(){
        return hasAge;
    }
    public void happyBirthday(){
        this.age++;
    }

    public boolean hasAdress(){
        return this.hasAdres;
    }
    //TEST


}
