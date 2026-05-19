package org.prog.session3;

public class Homework3 {
    public static void main (String[] args) {
        int [] mysort = new int[]{3, 2, 6, 1, 4, 5, 0, 8, 7, 9};
        boolean condition = true;

        while (condition) {
            condition = false;
            for (int i = 0; i < mysort.length - 1; i++) {
                if (mysort[i] > mysort[i + 1]) {
                 int temp = mysort[i];
                 mysort[i] = mysort[i + 1];
                 mysort[i + 1] = temp;

                 condition = true;
                }



            }
        }
        for (int num : mysort){
            System.out.print(num + "");
        }
    }
}
