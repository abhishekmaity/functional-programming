package programming;

import java.util.List;

public class FP_03 {
    public static void main(String[] args) {
        printAllEvenListOfNumber(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    private static void printAllEvenListOfNumber(List<Integer> integers) {
        integers.stream()
                .filter(FP_03::isEven)
                .forEach(System.out::println);
    }

    private static boolean isEven(Integer integer) {
        return integer%2==0;
    }
}