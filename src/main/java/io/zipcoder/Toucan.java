package io.zipcoder;

public class Toucan extends Pet {
    private String name;
    private int age;

    public Toucan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String speak(){
        return "Croak!";
    }
}