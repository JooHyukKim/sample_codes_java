package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Person> persons = getPersons();

        // List<Person> ---- List<Employee>
        List<Employee> employees = persons.stream()
                .map(p -> new Employee(p.getName(), p.getLastName(), 1000))
                .collect(Collectors.toList());

        employees.forEach(System.out::println);


    }

    static List<Person> getPersons() {
        return Arrays.asList(
                new Person("e1", "l1"),
                new Person("e2", "l1"),
                new Person("e3", "l2"),
                new Person("e4", "l4"),
                new Person("e5", "l5"),
                new Person("e6", "l6"),
                new Person("e7", "l7")
        );
    }
}



