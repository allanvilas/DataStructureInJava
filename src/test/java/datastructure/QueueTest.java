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
     * Test case to verify the removeLast operation.
     */
    @Test
    @DisplayName("Test removeLast operation")
    public void testremoveLast() {
        Queue<Integer> queue = new Queue<>(1);
        queue.add(2);
        assertEquals(2, queue.removeLast().value);
        assertEquals(1, queue.removeLast().value);
        queue.removeLast();
        assertEquals(0, queue.size());
    }

    /**
     * Test case to verify removeLast operation on an empty queue.
     */
    @Test
    @DisplayName("Test removeLast empty queue")
    public void testremoveLastEmpty() {
        Queue<Integer> queue = new Queue<>(1);
        queue.removeLast();
        assertNull(queue.removeLast());
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
            testQueue.removeLast();
            assertNull(testQueue.getLast());
        }
    }

    @Nested
    class TestReturninggetFirstNode {
         /**
         * Test if returns the element at the back of the queue.
         */
        @Test
        @DisplayName("Test if returns the element at the front of the queue")
        public void testReturnLastElement() {
            Queue<Integer> testQueue = new Queue<>(1);
            testQueue.add(2);
            testQueue.add(3);
            assertEquals(1, testQueue.getFirst().value);
        }

        /**
         * Test if returns null when trying to reach a null queue.
         */
        @Test
        @DisplayName("Test if returns null at the front of the queue")
        public void testIfWhaddIsEmptyBottomReturnsNull() {
            Queue<Integer> testQueue = new Queue<>(1);
            testQueue.removeLast();
            assertNull(testQueue.getFirst());
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
        testQueue.removeLast();
        assertTrue(testQueue.isEmpty());
    }

    /** 
     * Test if clear wip the queue.
     */
    @Test
    @DisplayName("Test if clear wip the queue")
    public void testWipingQueue() {
        Queue<Integer> testQueue = new Queue<>(1);
        assertFalse(testQueue.isEmpty());
        testQueue.clear();
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

    /** 
     * Class to nest get Node tests
    */

    @Nested
    class TestGetElements {
        /** 
         * Test if returns null when invalid index is given.
        */
        public void testReturningNullOnGivingInvalidIndex()
        {
            Queue<Integer> testQueue = new Queue<Integer>(1);
            assertNull(testQueue.get(1));
            assertNull(testQueue.get(-1));

        }

        /** 
         * Test if first element is returing 
        */
        public void testGetingQueueElements()
        {
            Queue<Integer> testQueue = new Queue<Integer>(1);
            testQueue.add(2);
            testQueue.add(3);

            assertEquals(1, testQueue.get(0).value);
            assertEquals(2, testQueue.get(1).value);
            assertEquals(3, testQueue.get(2).value);
        }   
    }
    
}
