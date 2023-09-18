package programming;

import java.util.List;

public class FP_e_05 {
    public static void main(String[] args){
        printCubeNumbers(List.of(4,84,15,564,2,0,-5,44,9,78,63,354,11));
    }

    public static void printCubeNumbers(List<Integer> number){
        number.stream()
                .map(numbers -> Math.pow(numbers,3))
                .forEach(System.out::println);
    }
}
