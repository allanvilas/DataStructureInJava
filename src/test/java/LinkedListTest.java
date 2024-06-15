import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import datastructure.DataStructures.LinkedList;

/**
 * Test class for the LinkedList data structure.
 */
public class LinkedListTest {

    LinkedList<String> linkedList = new LinkedList<>("Element 1");

    /**
     * Test case to fetch an element from the linked list.
     */
    @Test
    @DisplayName("Test fetching element from linked list")
    public void testFetchingElement() {
        String expected = "Element 1";
        LinkedList<String> list = linkedList;
        String linkedListValue = list.get(0).getData();
        assertEquals(expected, linkedListValue);
    }

    /**
     * Test case to verify if the list returns null after being made empty.
     */
    @Test
    @DisplayName("Test if list returns null after making it empty.")
    public void testIsListEmpty() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.makeEmpty();
        assertNull(list.get(0));
    }

    /**
     * Nested class for testing append operations in LinkedList.
     */
    @Nested
    class LinkedListAppendTests {
        
        /**
         * Test case to append a new element to the linked list.
         */
        @Test
        @DisplayName("Test appending new element")
        public void testAppendingNewValue() {
            String expected = "Element 2";
            LinkedList<String> list = linkedList;

            list.append(expected);
            String value = list.get(1).getData();
            assertEquals(value, expected);
        }

        /**
         * Test case to append a new element when the list length is zero.
         */
        @Test
        @DisplayName("Test appending new element when length is zero.")
        public void testAppendingWhenLengthIsZero() {
            String expected = "Element 2";
            LinkedList<String> list = linkedList;
            list.makeEmpty();

            list.append(expected);
            String headValue = list.getHead().getData();
            String tailValue = list.getTail().getData();
            String value = list.get(0).getData();

            assertEquals(value, expected);
            assertEquals(headValue, expected);
            assertEquals(tailValue, expected);
        }
    }

    /**
     * Test case to get the length of the linked list.
     */
    @Test
    @DisplayName("Get the length of the linked list")
    public void testListLength() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.append(5);
        list.append(1);
        list.append(7);

        assertEquals(4, list.getLength());
    }

    /**
     * Test case to verify if the correct item is removed from the head of the linked list.
     */
    @Test
    @DisplayName("Test if the correct item is removed from the head")
    public void testRemoveFirstItem() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.append(5);
        list.append(1);
        list.append(7);
        list.removeFirst();
        Integer headData = list.getHead().getData();
        Integer expected = 5;

        assertEquals(headData, expected);
    }

    /**
     * Test case to verify if the correct item is removed from the tail of the linked list.
     */
    @Test
    @DisplayName("Test if the correct item is removed from the tail")
    public void testRemoveLastItem() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.append(5);
        list.append(1);
        list.append(7);
        list.removeLast();
        Integer tailData = list.getTail().getData();
        Integer expected = 1;

        assertEquals(tailData, expected);
    }

    /**
     * Nested class for testing remove operations in LinkedList.
     */
    @Nested
    class LinkedListRemoveTests {
        
        /**
         * Test case to verify if the correct item is removed from a specified position in the linked list.
         */
        @Test
        @DisplayName("Test if the correct item is removed from a defined position")
        public void testRemoveItem() {
            LinkedList<Integer> list = new LinkedList<>(10);
            list.append(5);
            list.append(1);
            list.append(7);
            list.remove(0);
            Integer headData = list.get(0).getData();
            Integer expected = 5;

            assertEquals(headData, expected);
        }

        /**
         * Test case to verify if invoking remove(0) removes the first item from the linked list.
         */
        @Test
        @DisplayName("Test if invoking remove(0) removes the first item")
        public void testRemoveItemWhenZeroPassedAsParam() {
            LinkedList<Integer> list = new LinkedList<>(10);
            list.append(5);
            list.append(1);
            list.append(7);
            list.remove(0);
            Integer headData = list.getHead().getData();
            Integer expected = 5;

            assertEquals(headData, expected);
        }

        /**
         * Test case to verify if invoking remove(length-1) removes the last item from the linked list.
         */
        @Test
        @DisplayName("Test if invoking remove(length-1) removes the last item")
        public void testRemoveItemWhenLastIndexIsPassedAsParam() {
            LinkedList<Integer> list = new LinkedList<>(10);
            list.append(5);
            list.append(1);
            list.append(7);
            int removeIndex = list.getLength() - 1;
            list.remove(removeIndex);

            Integer tailData = list.getTail().getData();
            Integer expected = 1;

            assertEquals(tailData, expected);
        }
    }

    /**
     * Nested class for testing insert operations in LinkedList.
     */
    @Nested
    class LinkedListInsertItemTests {
        
        /**
         * Test case to verify if inserting an item at a defined position in the linked list.
         */
        @Test
        @DisplayName("Test inserting an item at a defined position")
        public void testInsertItem() {
            LinkedList<Integer> list = new LinkedList<>(10);
            list.append(5);
            list.append(1);
            list.append(7);

            list.insert(2, 15);

            Integer insertedData = list.get(2).getData();
            Integer expected = 15;

            assertEquals(insertedData, expected);
        }

        /**
         * Test case to verify if false is returned when invalid index values are passed to insert method.
         */
        @Test
        @DisplayName("Test if false is returned when invalid index values are passed")
        public void testInsertItemWithInvalidIndexValues() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertFalse(list.insert(-1, 15));
            assertFalse(list.insert(3, 15));
        }

        /**
         * Test case to verify if true is returned when inserting an item at index 0.
         */
        @Test
        @DisplayName("Test if true is returned when inserting an item at index 0")
        public void testInsertItemAtIndexZero() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertTrue(list.insert(0, 15));
            assertEquals(15, list.getHead().getData());
        }

        /**
         * Test case to verify if true is returned when inserting an item at the tail (length-1) index.
         */
        @Test
        @DisplayName("Test if true is returned when inserting an item at the tail index")
        public void testInsertItemAtTailIndex() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertTrue(list.insert(list.getLength() - 1, 15));
            assertEquals(10, list.getTail().getData());
        }
    }

    /**
     * Test case to verify if the correct item is set at a defined position in the linked list.
     */
    @Test
    @DisplayName("Test setting an item at a defined position")
    public void testSetItem() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.append(5);
        list.append(1);
        list.append(7);

        list.set(2, 15);

        Integer setData = list.get(2).getData();
        Integer expected = 15;

        assertEquals(setData, expected);
    }

    /**
     * Test case to verify adding an item at the head of the linked list.
     */
    @Test
    @DisplayName("Test adding an item at the head")
    public void testAddingItemAtHead() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.append(5);
        list.append(1);
        list.append(7);

        list.prepend(15);

        Integer headData = list.get(0).getData();
        Integer expected = 15;

        assertEquals(headData, expected);
    }
}
