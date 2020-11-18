package javageneric;

public class GenericMethod {

    public static <T> int count(T[] array) {
        return array.length;
    }

    public static <T> void getArr(T[] array, int index) {
        T arr = array[index];
        System.out.println("\t" + arr);
    }
}
