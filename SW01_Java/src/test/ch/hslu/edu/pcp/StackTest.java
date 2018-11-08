package test.ch.hslu.edu.pcp;

import ch.hslu.edu.pcp.Element;
import ch.hslu.edu.pcp.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {

    private Stack stack;
    Element element;
    Element secondElement;

    @BeforeEach
    void setUp() {
        this.stack = new Stack();
        this.element = new Element(3);
        this.secondElement = new Element(4);
    }

    @Test
    public void testStackSizeAfterCreatingInstance(){
        Assertions.assertEquals(0, this.stack.size());
    }

    @Test
    public void testIsEmpty(){
        Assertions.assertEquals(true, this.stack.isEmpty());
    }

    @Test
    public void testIfPushIncreasesStackSize(){

        this.stack.push(this.element);
        Assertions.assertEquals(1, this.stack.size());
    }

    @Test
    public void testGetTopElement(){
        this.stack.push(this.element);
        Assertions.assertEquals(this.element, this.stack.top());
    }


    @Test
    public void testPopStackIsEmpty(){
        this.stack.push(this.element);
        this.stack.pop();

        Assertions.assertTrue(this.stack.isEmpty());
    }

    @Test
    public void testTopAfterPop(){
        this.stack.push(this.element);
        this.stack.push(this.secondElement);
        this.stack.pop();

        Assertions.assertEquals(this.element, this.stack.top());
    }
}