package firstClasses;
import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {
    public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(10);
    numbers.add(11);
    numbers.add(33);
    numbers.add(44);
    numbers.add(55);
    numbers.add(66);

    numbers.remove(11);
    for (Integer number : numbers) {
        System.out.println(number);
    }

    System.out.println(numbers.contains(11));
    }
}