package org.prog.Work7;

public class HomeWork7 {
    public static void main(String[] args){
        Android android = new Android();
        Apple apple = new Apple();


        apple.color = "Red";
        apple.model = "11 Pro";

        android.color = "Black";
       android.model = "12";

        System.out.println(android.equals(apple));
        System.out.println(android.hashCode());
        System.out.println( android.color +  " Android " + android.model  );
        work(android);
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println(apple.equals(android));
        System.out.println(apple.hashCode());
        System.out.println( apple.color +  " Apple " + apple.model  );
        work(apple);


    }
    public static void work(IPhone phone){
        phone.unlockScreen();
        phone.call();

    }
}
