package javastring;

public class RuntimeApp {
    public static void main(String[] args) {
        
        Runtime runtime = Runtime.getRuntime();
        System.out.println();
        System.out.println("\t" + runtime.availableProcessors());
        System.out.println("\t" + runtime.freeMemory());
        System.out.println("\t" + runtime.totalMemory());
        System.out.println("\t" + runtime.maxMemory());
        System.out.println();

    }
}
