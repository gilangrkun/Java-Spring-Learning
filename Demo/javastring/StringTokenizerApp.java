package javastring;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    private static void myName(String name, String name2) {
        StringTokenizer sTokenizer = new StringTokenizer(name, " ");
        StringTokenizer sTokenizer2 = new StringTokenizer(name2, " ");
        
        // iterate all split String
        System.out.println();
        while(sTokenizer.hasMoreTokens()){
            String n = sTokenizer.nextToken();
            System.out.println("\t" + n);
        }

        System.out.println();
        
        // manual iterate of split String
        for(int i=0; i<2; i++) {
            String n = sTokenizer2.nextToken();
            System.out.println("\t" + n);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        myName("Gilang Riyadi Kuntiarso", "Gilang Riyadi Kuntiarso");
    }
}