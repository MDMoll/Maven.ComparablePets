package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class House {

    public List<Pet> house;

    public House() {
        this.house = new ArrayList<Pet>();
    }

    public void add(Dog dog) {
        this.house.add(dog);
    }

    public void add(Cat cat) {
        this.house.add(cat);
    }

    public void add(Toucan toucan) {
        this.house.add(toucan);
    }

    public Integer getNumberOfPets() {
        return this.house.size();
    }

    public Boolean contains(Dog dog) {
        return this.house.contains(dog);
    }

    public Boolean contains(Cat cat) {
        return this.house.contains(cat);
    }

    public Boolean contains(Toucan toucan) {
        return this.house.contains(toucan);
    }

    public Boolean isEmpty() {
        return this.house.isEmpty();
    }
}