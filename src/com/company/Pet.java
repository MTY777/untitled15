package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Shelter shelter;
    private Color color;

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }


private int generateDefaultAge(){
    Random random = new Random();
    return random.nextInt(10) + 1;
}
    public String getInfo() {
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }


}

