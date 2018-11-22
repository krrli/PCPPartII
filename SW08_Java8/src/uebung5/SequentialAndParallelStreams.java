package uebung5;

import java.util.stream.IntStream;

public class SequentialAndParallelStreams {

    public static void main(String[] args) {
        sequentialStream();
        parallelStream();
    }

    private static void sequentialStream() {
        IntStream intStream = IntStream.
                iterate(0, n -> n + 1).
                limit(100);

        System.out.println("Sequential Stream: ");
        intStream.forEach(n -> System.out.print(n + ", "));
    }

    /**
     * intStream wird in kleinere Teile aufgeteilt und dann abgearbeitet
     * Resultat wird am Schluss zusammengeführt und dann halt durcheinander ausgegeben
     */
    private static void parallelStream() {
        IntStream intStream = IntStream.
                iterate(0, n -> n + 1).
                limit(100);

        System.out.println("\n\nParallel Stream: ");
        intStream.parallel().forEach(n -> System.out.print(n + ", "));
    }

}

/**
 * aus Collection<T>
 * default Stream<E> stream() und parallelStream()
 * <p>
 * aus Array:
 * static <T> Stream<T> stream(T[] array)
 * <p>
 * Statische Stream Factories:
 * static <T> Stream<T> of(T... values)
 * static IntStream range(int startInc, int endExc)
 */
