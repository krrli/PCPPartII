package uebung2;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllInOne {
    public static void main(String[] args){
        new AllInOne().generateSortAndPrintRandomInts(7, 9000);
    }

    public void generateSortAndPrintRandomInts(int numberOfVals, int maxValueExc){
        StringJoiner stringJoiner = new StringJoiner(" > ", "reverse ordered list = { ", " }");

        List<Integer> integerList = new Random()
                .ints(0, maxValueExc)
                .limit(numberOfVals)
                .boxed()
                .collect(Collectors.toList());

        integerList.sort(Comparator.reverseOrder());
        integerList.forEach(i -> stringJoiner.add(String.valueOf(i)));
        System.out.println(stringJoiner);
    }
}
