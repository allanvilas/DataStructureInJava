import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import datastructure.DataStructures.Queue;

/**
 * Test class for the Queue data structure.
 */
public class QueueTest {

    private Queue<Integer> queue = new Queue<>(1);

    /**
     * Test case to verify the enqueue operation.
     */
    @Test
    @DisplayName("Test enqueue operation")
    public void testEnqueue() {
        queue.enqueue(2);
        assertEquals(2, queue.bottom().value);
        assertEquals(2, queue.getLength());
    }

    /**
     * Test case to verify the dequeue operation.
     */
    @Test
    @DisplayName("Test dequeue operation")
    public void testDequeue() {
        queue.enqueue(2);
        assertEquals(1, queue.dequeue().value);
        assertEquals(2, queue.dequeue().value);
        queue.dequeue();
        assertEquals(0, queue.getLength());
    }

    /**
     * Test case to verify dequeue operation on an empty queue.
     */
    @Test
    @DisplayName("Test dequeue empty queue")
    public void testDequeueEmpty() {
        queue.dequeue();
        assertNull(queue.dequeue());
        assertEquals(0, queue.getLength());
    }

    @Nested
    class TestReturningBottomNode {
         /**
         * Test if returns the element at the front of the queue.
         */
        @Test
        @DisplayName("Test if returns the element at the front of the queue")
        public void testReturnFirstElement() {
            Queue<Integer> testQueue = queue;
            testQueue.enqueue(2);
            testQueue.enqueue(3);
            assertEquals(3, queue.bottom().value);
        }

        /**
         * Test if returns null at the front of the queue.
         */
        @Test
        @DisplayName("Test if returns null at the front of the queue")
        public void testIfWhenQueueIsEmptyBottomReturnsNull() {
            Queue<Integer> testQueue = queue;
            testQueue.dequeue();
            assertNull(queue.bottom());
        }
    }
    
}
