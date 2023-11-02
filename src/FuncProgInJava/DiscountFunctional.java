package FuncProgInJava;

import java.util.Arrays;
import java.util.List;

public class DiscountFunctional {
    public static void findDiscountFunctional(final List<Integer> prices){
        final double totalOfDiscountedPrices = prices.stream()
                .filter(price -> price > 20)
                .mapToDouble(price -> price *0.9)
                .sum();
        System.out.println("Total of discounted prices: "+totalOfDiscountedPrices);
    }
    public static void main(String[] args){
        final List<Integer> prices = Arrays.asList(10, 30, 17, 18, 45, 12);
        findDiscountFunctional(prices);
    }
}
