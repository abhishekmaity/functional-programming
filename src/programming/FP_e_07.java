package programming;

import java.util.List;

public class FP_e_07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = addListOfSquareOfIntegers(integers);
        System.out.println(sum);
    }

    private static int addListOfSquareOfIntegers(List<Integer> integers) {
        return integers.stream()
                .mapToInt(number -> number * number)
                .reduce(0, Integer::sum);
    }

    private static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
