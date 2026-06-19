package org.prog.Work7;
import java.util.Objects;

public class Android extends Model implements IPhone{
    public Android(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Android() {
        this.model = model;
        this.color = color;

    }
    public String getColor(){
        return color;
    }

    @Override
    public void call() {
        System.out.println("Android: Calling my cat :) !");
    }

    @Override
    public void unlockScreen() {
        System.out.println("The Android screen is unlocked!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Android android)) return false;

        return Objects.equals(model, android.model)
                && Objects.equals(color, android.color);


    }
    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }



}








