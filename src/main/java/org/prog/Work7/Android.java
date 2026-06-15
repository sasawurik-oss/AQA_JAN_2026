package org.prog.Work7;

public class Android extends Model implements IPhone{
    @Override
    public void call() {
        System.out.println("Android: Calling my cat :) !");
    }

    @Override
    public void unlockScreen() {
        System.out.println("The Android screen is unlocked!");
    }



}




