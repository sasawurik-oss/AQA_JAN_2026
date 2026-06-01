
package org.prog.session5;
public class HomeWork5 {


    public static void main(String[] args){
        Car cars = new Car();
        cars.color = "pink";
        cars.mileage = 110;
        cars.owner = "Alexandra";
        cars.plateNumber = "AL-987";

        cars.goTo("Riga", 50);
    }
     class Car {

        public String color;
        public int mileage;
        public String plateNumber;
        public String owner;
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
