package programming;

import java.util.List;
import java.util.function.BinaryOperator;

public class FP_e_12 {

    private static final BinaryOperator<Integer> add = Integer::sum;

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sum = numbers.stream()
                .reduce(0, add);
        System.out.println(sum);
    }
}
