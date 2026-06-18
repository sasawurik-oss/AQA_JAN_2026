package org.prog.Work7;

public class HomeWork7 {
    private static String Apple;

    public static void main(String[] args){
        Android android = new Android();
        Apple apple = new Apple();
        Apple apple1 = new Apple();



        apple1.color = "Red";
        apple1.model = "11 Pro";

        apple.color = "Red";
        apple.model = null;

        try {
        if (apple.model == null) {
            throw new MyPhoneException(" Apple model is null");
        }
            apple.hashCode();
        } catch (MyPhoneException e) {
            System.err.println("oops!");
        }

        android.color = "Black";
       android.model = "12";



        System.out.println("===============================");

        System.out.println(android.hashCode());
        System.out.println( android.color +  " Android " + android.model  );
        work(android);
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println(apple.color.equals(apple1.color));
        System.out.println(apple.hashCode());
        System.out.println( apple.color +  " Apple " + apple.model  );
        work(apple);
        System.out.println("===============================");
        System.out.println(apple1.model.equals(apple.model));
        System.out.println(apple1.hashCode());
        System.out.println( apple1.color +  " Apple " + apple1.model  );
        work(apple);


    }
    public static void work(IPhone phone){
        phone.unlockScreen();
        phone.call();

    }
}
