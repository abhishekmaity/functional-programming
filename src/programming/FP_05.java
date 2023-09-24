package programming;

import java.util.List;

@SuppressWarnings("unused")
public class FP_05 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = addListOfIntegers(integers);
        System.out.println(sum);
    }

    private static int addListOfIntegers(List<Integer> integers) {
        return integers.stream()
    //            .reduce(0, FP_05::sum);
                  .reduce(0, Integer::sum);
    }

    private static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
