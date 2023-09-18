package programming;

import java.util.List;

public class FP_e_08 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = addListOfCubeOfIntegers(integers);
        System.out.println(sum);
    }

    private static int addListOfCubeOfIntegers(List<Integer> integers) {
        return integers.stream()
                .mapToInt(number -> number * number * number)
                .reduce(0, Integer::sum);
    }

    private static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
