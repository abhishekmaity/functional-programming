package programming;

import java.util.List;

public class FP_02 {
    public static void main(String[] args) {
        printAllListOfNumber(List.of(1,2,3,4,5,6,7,8,9));
    }

    @SuppressWarnings("All")
    private static void printAllListOfNumber(List<Integer> integers) {
//        for(int number:integers)
//            System.out.println(number);
        integers.stream()
                .forEach(FP_02::display);
    }

    private static void display(Integer integer) {
        System.out.println(integer);
    }
}