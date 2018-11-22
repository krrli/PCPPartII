package uebung4;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsAndLambdas {

    public String processNames(String[] names) {
        return Arrays.stream(names)
                .filter(n -> (n.length() >= 3 && n.length() <= 4))
                .map(n -> n.toUpperCase())
                .reduce("", (nl, nr) -> nl + nr + " ");
    }


    public static void main(String[] args) {
        String[] names = new String[]{"Susanna", "Joe", "Lu", "Timmy", "Rafael", "Lisa", "Lulu"};
        String nameAsString = new StreamsAndLambdas().processNames(names);
        System.out.println("." + nameAsString + ". ");
    }
}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/**
 * Hinweise: Verwenden Sie dazu einen String-Stream sowie passende Aggregate-Operationen.
 * Verwenden Sie an passender Stelle eine Methoden-Referenz auf eine String-Methode.
 *
 * Methoden-Referenz auf String Methode:
 * Methoden-Referenzen verwenden statt
 * - anonyme klasse
 * - lambda expression
 */
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
