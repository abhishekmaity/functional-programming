package programming;

import java.util.List;
import java.util.function.Predicate;

public class FP_07 {



    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        filterAndPrint(numbers, x -> x % 2 == 0);

        filterAndPrint(numbers, y -> y % 2 != 0);

        filterAndPrint(numbers, Z -> Z % 3 == 0);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
