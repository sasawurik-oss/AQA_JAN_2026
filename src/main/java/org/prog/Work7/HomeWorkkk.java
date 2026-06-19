package org.prog.Work7;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkkk {

    public static void main(String[] args) {
        List<Android> androids = new ArrayList<>();
        androids.add(new Android("Xiaomi", "pink"));
        androids.add(new Android("Xiaomi 11 Pro", "red"));
        androids.add(new Android("Xiaomi 12", "black"));
        androids.add(new Android("Xiaomi 13", "white"));
        androids.add(new Android("Redmi 13C", "pink"));
        androids.add(new Android("Redmi 7", "brow"));
        androids.add(new Android("Samsung A165F", "black"));
        androids.add(new Android("Samsung A566B", "grey"));
        androids.add(new Android("Samsung A266B", "mint"));
        androids.add(new Android("Redmi 15 8", "purple"));

        boolean it = false;
        boolean itt = false;

        for (Android android : androids) {
            if (android.getColor().equals("pink")){
                it = true;
            break;}
        }

        if (it) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // проверка наличия розового андроида

        for (Android android : androids) {
            if (android.getColor().equals("gold")){
                itt = true;
            break;}

        }
        if (itt) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //проверка наличия золотого андроида


        System.out.println("===============================");



        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("IPhone 17 Pro Max", "white"));
        apples.add(new Apple("IPhone 16 Pro Max", "black"));
        apples.add(new Apple("IPhone 17", "gold"));
        apples.add(new Apple("IPhone 11", "mint"));
        apples.add(new Apple("IPhone 10", "purple"));
        apples.add(new Apple("IPhone 14 Pro", "grey"));
        apples.add(new Apple("IPhone 15 Pro Max", "gold"));
        apples.add(new Apple("IPhone 15 Pro", "brow"));
        apples.add(new Apple("IPhone 9", "white"));
        apples.add(new Apple("IPhone 12 Pro", "red"));

        boolean at = false;
        boolean att = false;

        for (Apple apple : apples) {
            if (apple.getColor().equals("pink")){
                at = true;
            break;}
        }

        if (at) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //проверка наличия розового айфона

        for (Apple apple : apples) {
            if (apple.getColor().equals("gold")) {
                att = true;
            break;}
        }

        if (att) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
// проверка наличия золотого айфона










    }


}
