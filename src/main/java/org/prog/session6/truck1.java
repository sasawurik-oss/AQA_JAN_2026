package org.prog.session6;

public class truck1 {

        public String model;
        public String name;
        public String platenumber;

        public void setTruckInfo(String m, String n) {
            model = m;
            name = n;
        }

        public void delivery(String from, String to) {
            System.out.println(" Truck " + model + " with number " + platenumber + " owner by " + name +
                    " is delivering  " + from + " to " + to );
        }



}
