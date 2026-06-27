package org.prog.Work7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HomeWork12 {

    public static void main(String[] args) {

                Map<String, Set<IPhone>> owners = new HashMap<>();


                Set<IPhone> alexandraPhones = new HashSet<>();
                alexandraPhones.add(new Apple("Apple 15 Pro", "Gold"));
                alexandraPhones.add(new Android("Samsung S24", "Black"));
                System.out.println(alexandraPhones);


                Set<IPhone> annaPhones = new HashSet<>();
                annaPhones.add(new Apple("Apple 13", "White"));
                annaPhones.add(new Android("Redmi A55", "Pink"));


                Set<IPhone> katePhones = new HashSet<>();
                katePhones.add(new Apple("Apple 14", "Red"));
                katePhones.add(new Android("Xiaomi 14", "Blue"));


                owners.put("Alexandra", alexandraPhones);
                owners.put("Anna", annaPhones);
                owners.put("Kate", katePhones);

                System.out.println(owners);
            }
        }



