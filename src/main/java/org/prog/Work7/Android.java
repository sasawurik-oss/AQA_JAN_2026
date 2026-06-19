package org.prog.Work7;

public class Android extends Model implements IPhone{
    public Android(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public Android(String color) {
        this.model = model;
        this.color = color;
    }

    public Android() {
        this.model = model;
        this.color = color;

    }

    @Override
    public void call() {
        System.out.println("Android: Calling my cat :) !");
    }

    @Override
    public void unlockScreen() {
        System.out.println("The Android screen is unlocked!");
    }



    }








