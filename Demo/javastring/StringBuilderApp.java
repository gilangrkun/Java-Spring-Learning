package javastring;

public class StringBuilderApp {
    private static String myName() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Gilang");
        sBuilder.append(" ");
        sBuilder.append("Riyadi");
        sBuilder.append(" ");
        sBuilder.append("Kuntiarso");

        return sBuilder.toString();
    }
    private static String yourBeautifulName() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("xxxxx");
        sBuilder.append(" ");
        sBuilder.append("xxxxxxxx");
        sBuilder.append(" ");
        sBuilder.append("xxxx");

        return sBuilder.toString();
    }

    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("\t" + myName());
        System.out.println();
        System.out.println("\t" + yourBeautifulName());
        System.out.println();
        
    }
}
