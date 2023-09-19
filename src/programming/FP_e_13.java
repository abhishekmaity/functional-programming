package programming;

import java.util.List;
import java.util.function.Function;

public class FP_e_13 {



    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, Integer> squareNumbers = x -> x * x;

        squareAndPrint(numbers, squareNumbers);
    }

    private static void squareAndPrint(List<Integer> numbers, Function<Integer, Integer> squareNumbers) {
        numbers.stream()
                .map(squareNumbers)
                .toList()
                .forEach(System.out::println);
    }
}
