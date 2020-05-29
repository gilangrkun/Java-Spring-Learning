import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // Optional<String> hello = Optional.ofNullable("hello Japan");
        // Optional<String> hello = Optional.of(null);
        // Optional<String> hello = Optional.ofNullable("hello world");

        // System.out.println("\n" + hello.isEmpty());
        // System.out.println(hello.isPresent());
        // System.out.print("\n1. ");
        // hello.ifPresentOrElse(present -> {
        // System.out.println(present);
        // }, () -> {
        // System.out.println("hello UK");
        // });

        // Optional<String> hello2 = Optional.ofNullable(null);

        // System.out.println("\n" + hello.isEmpty());
        // System.out.println(hello.isPresent());

        // System.out.print("\n2. ");
        // hello2.ifPresentOrElse(present -> {
        // System.out.println(present);
        // }, () -> {
        // System.out.println("hello UK");
        // });

        /*
         * if optional contain null, then orElse is used. ex output -> "hello Indonesia"
         * if optional contain a values, then ifPresent is used. ex output ->
         * "hello Japan"
         */

        /*
         * String orElse = hello.map(String::toUpperCase).orElseGet(() -> { // ... extra
         * computation for retrieve the values return "hello indonesia"; });
         * 
         * System.out.printf("\n%s", orElse);
         */

        // if users input completely
        Data data = new Data("Alexa", "gorgeous.alexa@gmail.com", "@alexis");
        String email = data.getEmail().map(String::toLowerCase).orElse("email is not given");
        String twitter = data.getTwitterAcc().map(String::toLowerCase).orElse("twitter account is not given");

        // if users are not input completely
        Data data2 = new Data("Alexa", null, null);
        String email2 = data2.getEmail().map(String::toLowerCase).orElse("email is not given");
        String twitter2 = data2.getTwitterAcc().map(String::toLowerCase).orElse("twitter account is not given");

        System.out.println("\nemail1  :\t" + email);
        System.out.println("\nemail2  :\t" + email2);
        System.out.println("\ntwitter1:\t" + twitter);
        System.out.println("\ntwitter2:\t" + twitter2);
    }
}

class Data {

    private final String name;
    private final String email;
    private final String twitterAcc;

    public Data(String name, String email, String twitterAcc) {
        this.name = name;
        this.email = email;
        this.twitterAcc = twitterAcc;
    }

    public Optional<String> getTwitterAcc() {
        return Optional.ofNullable(twitterAcc);
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public String getName() {
        return name;
    }
}