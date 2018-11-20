package uebung1;

public class Exercise1 implements GeneralInterface, SpecificInterface {
    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        ex1.doIt();
    }
}

/**
 * 1. a)
 * Ausgabe: Do it the SPECIFIC way.
 *
 * 1. b)
 * SpecificInterface implementiert GeneralInterface (Interface-Hierarchie).
 * D.h. SpecificInterface ist Subinterface von GeneralInterface.
 * Bei Subinterfaces wird immer (automatisch) die spezifischere Implementierung verwendet.
 *
 * 1. c)
 * Entfernt man ' extends GeneralInterface ' im SpecificInterface gibt es einen Fehler.
 * Excercise1 müsste die Methode doIt überschreiben:
 * GeneralInterface.super.doIt(); bzw. SpecificInterface.super.doIt();
 *
 * Fehler:
 * Error:(3, 8) java: class uebung1.Exercise1 inherits unrelated defaults for doIt() from types uebung1.
 * GeneralInterface and uebung1.SpecificInterface
 */
