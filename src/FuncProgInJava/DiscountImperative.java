package FuncProgInJava;

import java.util.Arrays;
import java.util.List;

public class DiscountImperative {
    public static void findDiscountImperative(final List<Integer> prices){
        double totalOfDiscountedPrices = 0.0;
        for(int price: prices){
            if(price > 20)
                totalOfDiscountedPrices+= price * 0.9;
        }
        System.out.println("Total of discounted prices: "+totalOfDiscountedPrices);
    }
    public static void main(String[] args){
        final List<Integer> prices = Arrays.asList(10, 30, 17, 18, 45, 12);
        findDiscountImperative(prices);
    }
}
