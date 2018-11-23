package uebung6;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class EndlessNumbers {

    public static void main(String[] args) {

        // a)
        Random random = new Random();
        boolean foundAny = random.ints().anyMatch(i -> ((i >= 10_000) && (i <= 12_000)));
        System.out.println("foundAny = " + foundAny);

        // b)
        AtomicInteger atomicInteger = new AtomicInteger();
        random.ints().anyMatch(i -> {
            atomicInteger.incrementAndGet();
            return ((i >= 10_000) && (i <= 12_000));
        });
        System.out.println("Found suitable number at stream position " + atomicInteger.get());
    }

}

/**
 * 6a)
 * random: ints() von Random
 * anyMatch() Stream Operation
 * anyMatch ist short circuiting Operation (abbrechen, bevor letztes Element erreicht ist)
 * und  terminal -> Stream ist nach Konsumierung aufgebraucht!
 *
 * 6b)
 * Andere Lösung?
 * Counter KLasse wäre auch möglich
 *
 */
