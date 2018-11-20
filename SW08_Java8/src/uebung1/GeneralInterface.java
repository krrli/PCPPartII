package uebung1;

public interface GeneralInterface {
    default public void doIt() {
        System.out.println("Do it the GENERAL way.");
    }
}

