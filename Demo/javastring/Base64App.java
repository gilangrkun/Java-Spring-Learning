package javastring;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        
        String myName = "Gilang Riyadi Kuntiarso";
        String encoded = Base64.getEncoder().encodeToString(myName.getBytes());
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String res = new String(bytes);

        System.out.println();
        System.out.println("\t" + encoded);
        System.out.println("\t" + res);
        System.out.println();

    }
}
