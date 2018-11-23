package uebung3;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExercise {

    private static final long TWO_SECONDS = 2000;
    private static final long THREE_SECONDS = 3000;
    private static final long SIX_SECONDS = 6000;
    private static final String LASTSTRING = "was waiting for ";
    private static final String MS = "ms";

    private static final long HALF_SECOND = 500;

    public static void main(String[] args) {
        CompletableFutureExercise completableFuture = new CompletableFutureExercise();
        completableFuture.doSomethingWithCompletableFuture();
    }

    private void doSomethingWithCompletableFuture() {
        final CompletableFuture<Long> longLastingTaskFuture = CompletableFuture.supplyAsync(() -> {
            doBlockingWait(THREE_SECONDS);
            System.out.print(THREE_SECONDS);
            return THREE_SECONDS;
        });

        final CompletableFuture<Long> evenLongerLastingTaskFuture = CompletableFuture.supplyAsync(() -> {
            doBlockingWait(SIX_SECONDS);
            System.out.print(SIX_SECONDS);
            return SIX_SECONDS;
        });

        final CompletableFuture<String> lastTaskFuture = longLastingTaskFuture.thenCombineAsync(evenLongerLastingTaskFuture, (s, t) -> {
            doBlockingWait(TWO_SECONDS);
           System.out.print(LASTSTRING + (s+t+TWO_SECONDS) + MS);
            return LASTSTRING + (s+t+TWO_SECONDS) + MS;
        });

        System.out.println("-> Now waiting for things to happen!");
        for (int i = 0; i < 20; i++) {
            System.out.print(".");
            doBlockingWait(HALF_SECOND);
        }
        System.out.println();
        System.out.println("-> Done.");

    }

    public void doBlockingWait(long waitingTimeMillis) {
        try {
            Thread.sleep(waitingTimeMillis);
        } catch (InterruptedException ie) {
            System.out.println("nope nope nope");
        }
    }
}
