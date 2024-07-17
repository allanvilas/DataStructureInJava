package datastructure;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import datastructure.DataStructures.Queue;

/**
 * Test class for the Queue data structure.
 */
public class QueueTest {

    /**
     * Test case to verify the add operation.
     */
    @Test
    @DisplayName("Test add operation")
    public void testadd() {
        Queue<Integer> queue = new Queue<>(1);
        queue.add(2);
        assertEquals(2, queue.getLast().value);
        assertEquals(2, queue.size());
    }

    /**
     * Test case to verify the dequeue operation.
     */
    @Test
    @DisplayName("Test dequeue operation")
    public void testDequeue() {
        Queue<Integer> queue = new Queue<>(1);
        queue.add(2);
        assertEquals(1, queue.dequeue().value);
        assertEquals(2, queue.dequeue().value);
        queue.dequeue();
        assertEquals(0, queue.size());
    }

    /**
     * Test case to verify dequeue operation on an empty queue.
     */
    @Test
    @DisplayName("Test dequeue empty queue")
    public void testDequeueEmpty() {
        Queue<Integer> queue = new Queue<>(1);
        queue.dequeue();
        assertNull(queue.dequeue());
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }

    @Nested
    class TestReturningBottomNode {
         /**
         * Test if returns the element at the front of the queue.
         */
        @Test
        @DisplayName("Test if returns the element at the front of the queue")
        public void testReturnFirstElement() {
            Queue<Integer> testQueue = new Queue<>(1);
            testQueue.add(2);
            testQueue.add(3);
            assertEquals(3, testQueue.getLast().value);
        }

        /**
         * Test if returns null at the front of the queue.
         */
        @Test
        @DisplayName("Test if returns null at the front of the queue")
        public void testIfWhaddIsEmptyBottomReturnsNull() {
            Queue<Integer> testQueue = new Queue<>(1);
            testQueue.dequeue();
            assertNull(testQueue.getLast());
        }
    }

    @Nested
    class TestReturningPeekNode {
         /**
         * Test if returns the element at the back of the queue.
         */
        @Test
        @DisplayName("Test if returns the element at the front of the queue")
        public void testReturnLastElement() {
            Queue<Integer> testQueue = new Queue<>(1);
            testQueue.add(2);
            testQueue.add(3);
            assertEquals(1, testQueue.peek().value);
        }

        /**
         * Test if returns null when trying to reach a null queue.
         */
        @Test
        @DisplayName("Test if returns null at the front of the queue")
        public void testIfWhaddIsEmptyBottomReturnsNull() {
            Queue<Integer> testQueue = new Queue<>(1);
            testQueue.dequeue();
            assertNull(testQueue.peek());
        }
    }

    /** 
     * Test if returns true when queue is empty.
     */
    @Test
    @DisplayName("Test if returns true when queue is empty")
    public void testEmptyQueue() {
        Queue<Integer> testQueue = new Queue<>(1);
        assertFalse(testQueue.isEmpty());
        testQueue.dequeue();
        assertTrue(testQueue.isEmpty());
    }

    /** 
     * Test if size method returns rigth value.
     */
    @Test
    @DisplayName("Test if size method returns rigth value.")
    public void testQueueSize() {
        Queue<Integer> testQueue = new Queue<>(1);
        assertEquals(1, testQueue.size());
    }

    @Nested
    class TestContainsMethod {
        /** 
         * Test returning a first node with passed value.
         */
        @Test
        @DisplayName("Test returning a first node with passed value.")
        public void testReturningNodeThatContains() {
            Queue<Integer> testQueue = new Queue<>(1);
            testQueue.add(25);
            testQueue.add(35);
            testQueue.add(12);
            assertEquals(35, testQueue.contains(35).value);
        }

        /** 
         * Test returning a null when passed value don't exists.
         */
        @Test
        @DisplayName("Test returning a null when passed value don't exists.")
        public void testReturningNullWhaddDontContainsValue() {
            Queue<Integer> testQueue = new Queue<>(1);
            testQueue.add(25);
            testQueue.add(35);
            testQueue.add(12);
            assertNull(testQueue.contains(22));
        }

    }
    
    
}
