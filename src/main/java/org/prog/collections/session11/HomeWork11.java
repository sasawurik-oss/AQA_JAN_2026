package org.prog.collections.session11;

import java.util.ArrayList;
import java.util.List;

public class HomeWork11 {

    public static void main(String[] args){
        List<String> android = new ArrayList<>();
        android.add("pink");
        android.add("black");
        android.add("white");
        android.add("brow");
        android.add("red");
        android.add("blue");
        android.add("violet");
        android.add("orange");
        android.add("grey");
        android.add("pink");

        System.out.println(android.contains("pink"));
        System.out.println(android.contains("gold"));

        System.out.println("=====================");


        List<String> apple = new ArrayList<>();
        apple.add("gold");
        apple.add("black");
        apple.add("white");
        apple.add("brow");
        apple.add("red");
        apple.add("blue");
        apple.add("violet");
        apple.add("orange");
        apple.add("grey");
        apple.add("gold");

        System.out.println(apple.contains("pink"));
        System.out.println(apple.contains("gold"));

    }
}
