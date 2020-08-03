package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<_Stream.Person> people = List.of(
                new Person("Matheus", Gender.MALE),
                new Person("Jeniffer", Gender.FEMALE),
                new Person("Janaína", Gender.FEMALE),
                new Person("Marlon", Gender.MALE),
                new Person("Jeferson", Gender.MALE),
                new Person("Jessika", Gender.FEMALE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);
    }

    static class Person {
        private final String name;
        private final _Stream.Gender gender;

        public Person(String name, _Stream.Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
