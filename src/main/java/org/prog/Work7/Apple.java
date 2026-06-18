package org.prog.Work7;

public class Apple extends Model implements IPhone {
    public Apple(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Apple() {
        this.model = model;
        this.color = color;

    }

    @Override
    public void call(){System.out.println("Apple: Calling my broo!");}

    @Override
    public void unlockScreen(){System.out.println("The Apple screen is unlocked!");}





}






