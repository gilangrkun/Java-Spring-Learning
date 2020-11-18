package javageneric.app;

import javageneric.GenericClass;

public class GenericClassApp {
    public static void main(String[] args) {

        GenericClass<String> str = new GenericClass<String>("Hello", "World");
        GenericClass<Integer> intr = new GenericClass<Integer>(100, 200);

        System.out.println();
        System.out.println(str.getData() + " " + str.getData2());
        System.out.println();
        System.out.println(
                intr.getData() + " + " + intr.getData2() + " = " + Integer.sum(intr.getData(), intr.getData2()));
        System.out.println();

    }
}
