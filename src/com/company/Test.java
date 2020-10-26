package com.company;

import java.lang.*;

public class Test {
    public static void main(String[] args) {

        int[] massiv = new int[]{12, 45, 2, 60, 100, 15, 19, 36, 9, 10};

        Circle ac1 = new Circle (massiv);
        System.out.println(ac1.printFor());
        System.out.println(ac1.printWhile());
        System.out.println(ac1.printDo());
    }
}