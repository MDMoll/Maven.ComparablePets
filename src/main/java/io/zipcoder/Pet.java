package io.zipcoder;

public class Pet {
    public String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String speak() {
        return "Buckaw!";
    }

    public void setName(String givenName) {
        this.name = givenName;
    }

    public String getName() {
        return this.name;
    }
}
