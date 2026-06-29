package org.prog.Work7;

import java.util.Objects;
import java.util.Random;

public class Apple extends Model implements IPhone {
    public Apple(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Apple() {
        this.model = model;
        this.color = color;

    }

    public String getColor(){
        return color;
    }
    public int modelNumber() {
         Random random = new Random();
        int n = random.nextInt(5);
        return n;
    }


    @Override
    public void call(){System.out.println("Apple: Calling my broo!");}

    @Override
    public void unlockScreen(){System.out.println("The Apple screen is unlocked!");}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple apple)) return false;

        return Objects.equals(model, apple.model)
                && Objects.equals(color, apple.color);


    }
    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }






}






