package javastring;

import java.util.UUID;

public class UUIDapp {
    public static void main(String[] args) {
        int i = 0;

        // uuid is class for creating/generating a random unique number or String

        System.out.println();
        while(i<10) {
            UUID uuid = UUID.randomUUID();
            System.out.println("\t" + uuid.toString());
            i++;
        }
        System.out.println();

    }
}
