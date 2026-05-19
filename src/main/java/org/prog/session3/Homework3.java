package org.prog.session3;

import java.util.Random;

public class Homework3 {
    public static void main (String[] args) {
        Random random = new Random();
        int [] mysort = new int[100];
        for (int i = 0; i < mysort.length; i++){
            mysort[i] = random.nextInt(1000);
            System.out.println(mysort[i]);
        }
        System.out.println("=========================");
        boolean condition = true;

        do {
            condition = false;
            for (int i = 0; i < mysort.length - 1; i++) {
                if (mysort[i] > mysort[i + 1]) {
                    int current = mysort[i];
                    mysort[i] = mysort[i + 1];
                    mysort[i + 1] = current;
                    condition = true;
                }

            }
        } while (condition);

        for (int i = 0; i < mysort.length; i++){
            System.out.print(mysort[i]);
        }
    }
}
