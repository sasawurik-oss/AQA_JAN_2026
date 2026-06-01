package org.prog.session5;

public class HomeWork5 {
    public String color;
    public int mileage;
    public String plateNumber;
    public String owner;

    public static void main(String[] args){
        HomeWork5 car = new HomeWork5();
        car.color = "pink";
        car.mileage = 110;
        car.owner = "Alexandra";
        car.plateNumber = "AL-987";

        car.goTo("Riga", 50);
    }

    public void goTo(String destination, int speed) {
        System.out.println("before trip miles: " + mileage);
        if ("pink".equals(color)) {
            System.out.println("Pink cars are cute:)");
        }
        mileage += speed * 10;
        System.out.println(color + " car is going to " + destination +
                " at " + speed + " km/h");
        System.out.println("After trip miles: " + mileage);
        System.out.println(" Car owner by " + owner + " is going to " + destination + " at " + speed + " km/h ");
        System.out.println(" Cute " + color + " car with number " + plateNumber + " owner by " + owner +
                " is going to " + destination + " at " + speed + " km/h ");
    }
}
