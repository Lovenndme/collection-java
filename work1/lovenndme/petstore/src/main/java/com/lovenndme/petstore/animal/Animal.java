package com.lovenndme.petstore.animal;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int sex;
    protected double price;

    public Animal(){
    }

    public Animal(String name, int age, int sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getSex() {
        return sex;
    }


    public void setSex(int sex) {
        this.sex = sex;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String toString();

}
