package ch.hslu.edu.pcp;

import ch.hslu.edu.pcp.interfaces.StackInterface;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class Stack implements StackInterface {

    private Element topElement;
    private int size = 0;

    public Stack(){

    }

    // fügt ein Element zum Stack hinzu
    @Override
    public void push(Element e) {
        e.setNext(this.topElement);
        this.topElement = e;
        this.size++;
    }

    // liefert das zuletzt hinzugefügte Element zurück
    @Override
    public Element top() {
        return this.topElement;
    }

    // entfernt das zuletzt hinzugefügte Element.
    @Override
    public boolean pop() {
        if(this.topElement == null) return false;

        this.topElement = this.topElement.getNext();
        this.size--;
        return true;
    }

    @Override
    public void print() {
        System.out.print("print - Stack ");
        if (isEmpty()){
            System.out.println("is empty");
        }
        else {
            System.out.println("contains: " + topElement.toString() + ", top element: " + topElement.getValue());
        }
    }

    @Override
    public boolean isEmpty() {
        return (this.size == 0);
    }

    @Override
    public int size() {
        return this.size;

    }
}
