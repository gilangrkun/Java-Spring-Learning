package javastring;

import java.util.Arrays;

public class ArraysApp {
    private static void myArray(int[] data) {
        // untuk mengurutkan element pada array
        Arrays.sort(data);
        System.out.println("\t" + Arrays.toString(data));

        // untuk mencari element
        int element1 = Arrays.binarySearch(data, 10);
        int element2 = Arrays.binarySearch(data, 4);
        System.out.println("\t" + element1);
        System.out.println("\t" + element2);

        // mengkopi array berdasarkan panjang element atau range antara
        int[] res = Arrays.copyOf(data, data.length);
        System.out.println("\t" + Arrays.toString(res));

        int[] res3 = Arrays.copyOf(data, 6);
        System.out.println("\t" + Arrays.toString(res3));

        int[] res2 = Arrays.copyOfRange(data, 6, 12);
        System.out.println("\t" + Arrays.toString(res2));
    }

    public static void main(String[] args) {

        int[] numbers = { 10, 3, 4, 5, 2, 8, 34, 57, 12, 77, 45, 72, 21, 4, 21, 6, 2, };
        System.out.println();
        myArray(numbers);
        System.out.println();
    }
}
