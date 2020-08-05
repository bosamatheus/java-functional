package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        var customer = new Customer("Alice",
                "alice@gmail.com",
                "+0123456789",
                LocalDate.of(2000, 12, 1));

        //System.out.println(new CustomerValidatorService().isValid(customer));

        // If valid we can store customer in DB

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
