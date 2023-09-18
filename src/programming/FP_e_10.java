package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP_e_10 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = evenNumbers(integers);
        System.out.println(evenNumbers);

    }

    private static List<Integer> evenNumbers(List<Integer> integers) {
        return integers.stream()
                .filter(number -> number%2==0)
                .collect(Collectors.toList());
    }
}
