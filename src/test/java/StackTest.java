import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Nested;

import datastructure.DataStructures.Stack;

public class StackTest {
    
    Stack<Integer> stack = new Stack<>(10);

    @Test
    @DisplayName("Instance and get initialization node from stack")
    public void TestNewStackInstance() {
        Stack<Integer> stack = this.stack;
        assertEquals(10, stack.getTop().getValue());
        assertEquals(1, stack.getHeigth());
    }

    @Test
    @DisplayName("Test if method make empty do it`s job")
    public void testMakingStackEmpty() {
        Stack<Integer> stack = this.stack;
        stack.makeEmpty();
        assertNull(stack.getTop());
        assertEquals(0, stack.getHeigth());
    }

    @Nested
    class StackPushNewItemTests {
        @Test
        @DisplayName("Test if method makeEmpty correctly empties the stack")
        public void testMakeEmpty() {
            Stack<Integer> stack = new Stack<>(10);

            // Verifica se a pilha inicialmente tem um elemento
            assertEquals(1, stack.getHeigth());

            // Esvazia a pilha
            stack.makeEmpty();

            // Verifica se a pilha está vazia
            assertEquals(0, stack.getHeigth());
        }

        @Test
        @DisplayName("Test pushing a new item into the stack after it has been emptied")
        public void testPushAfterEmpty() {
            Stack<Integer> stack = new Stack<>(10);

            // Esvazia a pilha
            stack.makeEmpty();

            // Adiciona um novo item à pilha
            stack.push(5);

            // Verifica se o novo item está no topo da pilha
            assertEquals(5, stack.getTop().getValue());

            // Verifica se a altura da pilha é 1
            assertEquals(1, stack.getHeigth());
        }
    }

    @Nested
    class StackPopItemTests {
        @Test
        @DisplayName("Test if pop removes an item and returns true")
        public void testPopRemovesItemAndReturnsTrue() {
            Stack<Integer> stack = new Stack<>(10);
            assertTrue(stack.pop());
        } 

        @Test
        @DisplayName("Test if pops return true when tried to pop from a empty stack")
        public void testPopReturnFalseWhenTriedToPopOnEmptyStack()
        {
            Stack<Integer> stack = new Stack<>(10);
            stack.makeEmpty();
            assertFalse(stack.pop());
        }
    }    
}
