import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // Optional<String> hello = Optional.ofNullable("hello Japan");
        Optional<String> hello = Optional.of("hello Indonesia");

        System.out.println(hello.isEmpty());
        System.out.println(hello.isPresent());

        /*
         * if optional contain null, then orElse is used. ex output -> "hello Indonesia"
         * if optional contain a values, then ifPresent is used. ex output ->
         * "hello Japan"
         */

        // hello.ifPresentOrElse(present -> {
        // System.out.println("\n" + present);
        // }, () -> {
        // System.out.println("\nhello Indonesia");
        // });

        /*
         * String orElse = hello.map(String::toUpperCase).orElseGet(() -> { // ... extra
         * computation for retrieve the values return "hello indonesia"; });
         * 
         * System.out.printf("\n%s", orElse);
         */

    }
}