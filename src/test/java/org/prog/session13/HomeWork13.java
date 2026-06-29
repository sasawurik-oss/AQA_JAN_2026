package org.prog.session13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.prog.Work7.Apple;

import java.util.Random;

public class HomeWork13 {


    @Test
    public void testModel() {
        Apple apple = new Apple();
        Assertions.assertTrue(apple.modelNumber() >= 3);
        System.out.println("==== TEST ====");


    }
}
