package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Object value = Optional.empty()
                .orElseGet(() -> "Default value");
        System.out.println(value);

        Supplier<IllegalStateException> exception =
                () -> new IllegalStateException("Exception");
        Object obj = Optional.of("Hello")
                .orElseThrow(exception);
        System.out.println(obj);

        Optional.of("jose@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));
    }
}
