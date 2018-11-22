package uebung1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTypes {

    public static void main(String[] args){
        String[] namesArray = {"Joe", "Tara", "Sue", "Tim" };
        OptionalTypes ot = new OptionalTypes();

        ot.eisA(namesArray);
        Optional<String> optionalString = ot.reduceAndPrintStrings(namesArray);
        ot.printOptional(optionalString, "[DEFAULT]");

        Optional<String> optionalEmptyString = ot.reduceAndPrintStrings(new String[]{"Joe", "Sue"});
        ot.printOptional(optionalEmptyString, "[DEFAULT]");
    }

    // 1a)
    // Verwendung von Optional machts erkennbar, dass null zurückkommen könnte.
    private void eisA(String[] namesArray) {
        List<String> names = Arrays.asList(namesArray);
        Optional<String> x = names
                .stream()
                .filter(s -> s.startsWith("T"))
                .map(s -> s.toUpperCase())
                .reduce((s, t) -> s + " " + t);
        System.out.println(x.get());
    }

    // 1b)
    public Optional<String> reduceAndPrintStrings(String[] namesArray){
        List<String> names = Arrays.asList(namesArray);
        Optional<String> x = names
                .stream()
                .filter(s -> s.startsWith("T"))
                .map(s -> s.toUpperCase())
                .reduce((s, t) -> s + " " + t);

        x.ifPresent(s -> System.out.println("[Debugoutput] x = " + s));
        return x;
    }

    // 1c)
    public void printOptional(Optional<String> optionalString, String defaultValue){


        System.out.println("value = " + optionalString.orElse(defaultValue));
    }

}