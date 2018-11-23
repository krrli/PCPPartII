package uebung4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalThinking {

    public static void main(String[] args){
        List<String> strings = Arrays.asList("Java", "is", "cool");
        FunctionalThinking ft = new FunctionalThinking();

        System.out.println("------ Aufgabe 4------ ");
        String message = String.join(" ", strings);
        System.out.println(message+"\n");


        String java7joinedString = ft.join(strings);
        System.out.println("------ 4a)------ ");
        System.out.println(java7joinedString);
    }

    /*
        4a): S. Implementierung
        4b): Verwendung von Kontrollstrukturen zur Steuerung der Befehlsausführung - z.B. loop (foreach)
        nope: zwischenspeichern von variablen / statusänderung!
        4c): Programme sind kurz, klar, gut zu warten, zuverlässig und schnell zu erstellen
             Verkettung von Funktionsaufrufen

             Programme bestehen aus Definitionen von Funktionen mit Parametern und Rückgabewerten
             Rückgabewert hängt ausschliesslich von den Parametern ab
             Aufgaben in kleinere zerlegen, und sie wieder zusammenführen (dekomposition und komposition)

             !!!!!!!!!!!!!!!!!!!!!!!!
             Funktionen können als Paramterer übergeben werden. erheblicher unterschied, darum richtige antwort zur frage
             !!!!!!!!!!!!!!!!!!!!!!!!


        4d): Fokussierung auf Problem - was will man lösen? Weiter weg von Details (z.B. Loop)
     */
    public String join(List<String> strings){
        String joinedString = "";
        for(String string : strings){
            joinedString += string + " ";
        }

        return joinedString;
    }
}
