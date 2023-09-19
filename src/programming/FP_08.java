package programming;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class FP_08 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Supplier<Integer> result = () -> {
            Random random = new Random();
            return random.nextInt(5);
        };

        System.out.printf(String.valueOf(result.get()));

    }
}
