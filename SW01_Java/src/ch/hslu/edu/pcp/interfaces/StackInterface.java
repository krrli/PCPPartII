package ch.hslu.edu.pcp.interfaces;

import ch.hslu.edu.pcp.Element;

public interface StackInterface {
    void push(Element e);
    Element top();
    boolean pop();
    void print();
    boolean isEmpty();
    int size();
}
