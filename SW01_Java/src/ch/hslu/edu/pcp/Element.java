package ch.hslu.edu.pcp;

import ch.hslu.edu.pcp.interfaces.ElementInterface;

public class Element implements ElementInterface {

    private int value;
    private Element next;

    public Element(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public Element getNext() {
        return this.next;
    }

    @Override
    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString(){
        String s = String.valueOf(this.value);
        if(next != null){
            s += ", " + next.toString();
        }
        return s;
    }
}
