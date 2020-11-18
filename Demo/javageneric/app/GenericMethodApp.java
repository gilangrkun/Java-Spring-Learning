package javageneric.app;

import javageneric.GenericMethod;

public class GenericMethodApp {
    public static void main(String[] args) {

        String[] dataStr = { "Gilang", "Riyadi", "Kuntiarso" };
        Integer[] dataInt = { 10, 20, 30, 40, 50, 60, 70 };

        System.out.println();
        System.out.println("\t" + GenericMethod.count(dataStr));
        GenericMethod.getArr(dataStr, 2);
        System.out.println();
        System.out.println("\t" + GenericMethod.count(dataInt));
        GenericMethod.getArr(dataInt, 4);
        System.out.println();

    }
}
