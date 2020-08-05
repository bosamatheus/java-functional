package finalsection;

import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {

        hello("Robinson", "Montana", value -> System.out.println("No lastname provided for " + value));
        hello("José", null, value -> System.out.println("No lastname provided for " + value));

        hi("Bob", null, () -> System.out.println("No lastname provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hi(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
