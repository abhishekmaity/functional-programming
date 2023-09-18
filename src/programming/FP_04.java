package programming;

import java.util.List;

public class FP_04 {
    public static void main(String[] args) {
        printAllEvenListOfNumber(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    private static void printAllEvenListOfNumber(List<Integer> integers) {
        integers.stream()
                .filter(integer -> integer%2==0)
                .forEach(System.out::println);
    }
}