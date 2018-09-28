package ch.hslu.edu.pcp;

import ch.hslu.edu.pcp.interfaces.ElementInterface;

public class Element implements ElementInterface {

    public Element(int value) {

    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public ElementInterface getNext() {
        return null;
    }

    @Override
    public void setNext(ElementInterface next) {

    }
}
