package testcases;

import java.util.EmptyStackException;

import org.junit.Test;

import mahender.Stack;

public class StackTest {


    static Stack emptystack = new Stack();

    @Test(expected = EmptyStackException.class)
    public void testPopEmptyStack() {
        emptystack.pop();
    }
}