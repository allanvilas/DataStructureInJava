import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Nested;

import datastructure.DataStructures.Stack;

/**
 * JUnit tests for the Stack data structure.
 */
public class StackTest {
    
    Stack<Integer> stack = new Stack<>(10);

    /**
     * Test case: Instance and get initialization node from stack
     */
    @Test
    @DisplayName("Test if size() returns stacks right size.")
    public void TestStackSize() {
        Stack<Integer> stack = this.stack;
        
        // Returns stack size
        assertEquals(1, stack.size());
    }

    /**
     * Test case: Instance and get initialization node from stack
     */
    @Test
    @DisplayName("Instance and get initialization node from stack")
    public void TestNewStackInstance() {
        Stack<Integer> stack = this.stack;
        assertEquals(10, stack.getTop().getValue());
        assertEquals(1, stack.size());
    }

    /**
     * Test case: Test if method make empty does its job
     */
    @Test
    @DisplayName("Test if method make empty do its job")
    public void testMakingStackEmpty() {
        Stack<Integer> stack = this.stack;
        stack.makeEmpty();
        assertNull(stack.getTop());
        assertEquals(0, stack.size());
    }

    /**
     * Nested tests for pushing new items into the stack.
     */
    @Nested
    class StackPushNewItemTests {

        /**
         * Test case: Test if method makeEmpty correctly empties the stack
         */
        @Test
        @DisplayName("Test if method makeEmpty correctly empties the stack")
        public void testMakeEmpty() {
            Stack<Integer> stack = new Stack<>(10);

            // Check if the stack initially has one item
            assertEquals(1, stack.size());

            // Check if isEmpty returns false
            assertFalse( stack.isEmpty());

            // Empty the stack
            stack.makeEmpty();

            // Check if the stack is empty
            assertTrue( stack.isEmpty());
        }

        /**
         * Test case: Test pushing a new item into the stack after it has been emptied
         */
        @Test
        @DisplayName("Test pushing a new item into the stack after it has been emptied")
        public void testPushAfterEmpty() {
            Stack<Integer> stack = new Stack<>(10);

            // Empty the stack
            stack.makeEmpty();

            // Push a new item onto the stack
            stack.push(5);

            // Check if the new item is at the top of the stack
            assertEquals(5, stack.getTop().getValue());

            // Check if the stack height is 1
            assertEquals(1, stack.size());
        }
    }

    /**
     * Nested tests for popping items from the stack.
     */
    @Nested
    class StackPopItemTests {

        /**
         * Test case: Test if pop removes an item and returns true
         */
        @Test
        @DisplayName("Test if pop removes an item and returns true")
        public void testPopRemovesItemAndReturnsTrue() {
            Stack<Integer> stack = new Stack<>(10);
            assertTrue(stack.pop());
        } 

        /**
         * Test case: Test if pop returns false when tried to pop from an empty stack
         */
        @Test
        @DisplayName("Test if pop returns false when tried to pop from an empty stack")
        public void testPopReturnFalseWhenTriedToPopOnEmptyStack() {
            Stack<Integer> stack = new Stack<>(10);
            stack.makeEmpty();
            assertFalse(stack.pop());
        }
    }    
}
