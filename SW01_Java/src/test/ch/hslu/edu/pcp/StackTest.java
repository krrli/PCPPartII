package test.ch.hslu.edu.pcp;

import ch.hslu.edu.pcp.Element;
import ch.hslu.edu.pcp.Stack;
import org.junit.Assert;
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
        Assert.assertEquals(0, this.stack.size());
    }

    @Test
    public void testIsEmpty(){
        Assert.assertEquals(true, this.stack.isEmpty());
    }

    @Test
    public void testIfPushIncreasesStackSize(){

        this.stack.push(this.element);
        Assert.assertEquals(1, this.stack.size());
    }

    @Test
    public void testGetTopElement(){
        this.stack.push(this.element);
        Assert.assertEquals(this.element, this.stack.top());
    }


    @Test
    public void testPopStackIsEmpty(){
        this.stack.push(this.element);
        this.stack.pop();

        Assert.assertTrue(this.stack.isEmpty());
    }

    @Test
    public void testTopAfterPop(){
        this.stack.push(this.element);
        this.stack.push(this.secondElement);
        this.stack.pop();

        Assert.assertEquals(this.element, this.stack.top());
    }
}