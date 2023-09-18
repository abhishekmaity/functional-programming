package programming;

import java.util.List;

public class FP_e_01 {
    public static void main(String[] args){
        printOddNumbers(List.of(4,84,15,564,2,0,-5,44,9,78,63,354,11));
    }

    public static void printOddNumbers(List<Integer> number){
        number.stream()
                .filter(numbers -> numbers%2!=0)
                .forEach(System.out::println);
    }
}
