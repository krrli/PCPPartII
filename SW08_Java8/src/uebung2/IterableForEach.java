package uebung2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IterableForEach {

    public static void main(String[] args) {
        printNumbersAndSquares(new Integer[]{1, 2, 3, 5, 8});
    }

    private static void printNumbersAndSquares(final Integer[] numbers){
        //Arrays.asList(numbers).forEach(System.out::print);
        Arrays.asList(numbers).forEach(num -> System.out.println(num + ": " + num*num));
    }
}
