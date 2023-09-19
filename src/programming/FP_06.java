package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP_06 {
    private static final Predicate<Integer> isEven = n -> n%2==0;
    private static final Function<Integer, Integer> isSquare = n -> n*n;
    private static final Consumer<Integer> display = System.out::println;

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        integers.stream()
                .filter(isEven)
                .map(isSquare)
                .forEach(display);

    }
}
