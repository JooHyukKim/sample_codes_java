package sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

    public static void main(String[] args) {
        List<PersonName> people = new ArrayList<>();
        people.add(new PersonName("첫번째", 1));
        people.add(new PersonName("두번째", 2));
        people.add(new PersonName("세번째", 3));
        people.add(new PersonName("네번째", 4));
        people.add(new PersonName("다섯번째", 5));
        people.add(new PersonName("여섯번째", 6));
        people.add(new PersonName("일곱번째", 7));

        people.sort(new PeopleSorter());

        people.forEach(System.out::println);
    }

    @Test
    public void sortTest() {
        List<PersonName> people = new ArrayList<>();
        people.add(new PersonName("첫번째", 1));
        people.add(new PersonName("두번째", 2));
        people.add(new PersonName("세번째", 3));
        people.add(new PersonName("네번째", 4));
        people.add(new PersonName("다섯번째", 5));
        people.add(new PersonName("여섯번째", 6));
        people.add(new PersonName("일곱번째", 7));

        people.sort(new PeopleSorter());

        people.forEach(System.out::println);
    }

}

class PeopleSorter implements Comparator<PersonName> {

    @Override
    public int compare(PersonName o1, PersonName o2) {
        return o2.valueOfName() - o1.valueOfName();
    }
}
