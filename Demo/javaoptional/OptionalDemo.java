import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // Optional<String> hello = Optional.ofNullable("hello Japan");
        // Optional<String> hello = Optional.of(null);
        Optional<String> hello = Optional.ofNullable("hello world");

        // System.out.println("\n" + hello.isEmpty());
        // System.out.println(hello.isPresent());
        System.out.print("\n1. ");
        hello.ifPresentOrElse(present -> {
            System.out.println(present);
        }, () -> {
            System.out.println("hello UK");
        });

        Optional<String> hello2 = Optional.ofNullable(null);

        // System.out.println("\n" + hello.isEmpty());
        // System.out.println(hello.isPresent());

        System.out.print("\n2. ");
        hello2.ifPresentOrElse(present -> {
            System.out.println(present);
        }, () -> {
            System.out.println("hello UK");
        });

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

    }
}