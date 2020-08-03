package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000980700"));

        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println("Is phone number valid and contains number 3? "
                + isPhoneNumberValidPredicate.and(constainsNumberThreePredicate).test("09000980703"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> constainsNumberThreePredicate =
            phoneNumber -> phoneNumber.contains("3");
}
