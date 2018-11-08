package test.ch.hslu.edu.pcp;

import ch.hslu.edu.pcp.Element;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {

    private Element element;

    @BeforeEach
    void setUp() {
        this.element = new Element(5);
    }

    @Test
    public void testGetValueOfElement(){
        Assertions.assertEquals(5, this.element.getValue());
    }

    @Test
    public void testNextElement(){
        Element nextElement =  new Element(6);
        this.element.setNext(nextElement);

        assertEquals();
        Assertions.assertEquals(nextElement, this.element.getNext());
    }

}