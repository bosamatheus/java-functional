package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> {
            // Logic
            if (name.isBlank()) throw new IllegalArgumentException("Exception");
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Galileu"));

        BiFunction<String, Integer, String> upperCaseNameWithAge = (name, age) -> {
            // Logic
            if (name.isBlank()) throw new IllegalArgumentException("Exception");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseNameWithAge.apply("Alex", 20));
    }
}
