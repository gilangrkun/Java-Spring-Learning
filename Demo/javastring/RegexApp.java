package javastring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        
        String myName = "Gilang Riyadi Kuntiarso is a Junior Web Developer";

        // pattern ini artinya mencari kata yang memiliki huruf a ditengahnya
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(myName);

        System.out.println();
        while(matcher.find()) {
            String res = matcher.group();
            System.out.println("\t" + res);
        }
        System.out.println();

    }
}
