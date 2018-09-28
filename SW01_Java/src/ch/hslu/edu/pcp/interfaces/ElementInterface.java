package ch.hslu.edu.pcp.interfaces;

import ch.hslu.edu.pcp.Element;

public interface ElementInterface {

    int getValue();
    Element getNext();
    void setNext(Element next);
}
