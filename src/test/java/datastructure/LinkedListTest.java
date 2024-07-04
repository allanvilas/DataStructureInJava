package datastructure;
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
        String linkedListValue = list.get(0).getValue();
        assertEquals(expected, linkedListValue);
    }

    /**
     * Test case to verify if the list returns null after being made empty.
     */
    @Test
    @DisplayName("Test if list returns null after making it empty.")
    public void testIsListEmpty() {
        LinkedList<Integer> list = new LinkedList<>(10);
        // test if the function recognize itens in the list
        assertFalse(list.isEmpty());

        // Test clearing and checking if the list is empty
        list.clear();
        assertNull(list.get(0));
        assertTrue(list.isEmpty());
    }

    /**
     * Nested class for testing add operations in LinkedList.
     */
    @Nested
    class LinkedListaddTests {
        
        /**
         * Test case to add a new element to the linked list.
         */
        @Test
        @DisplayName("Test adding new element")
        public void testaddingNewValue() {
            String expected = "Element 2";
            LinkedList<String> list = linkedList;

            list.add(expected);
            String value = list.get(1).getValue();
            assertEquals(value, expected);
        }

        /**
         * Test case to add a new element when the list length is zero.
         */
        @Test
        @DisplayName("Test adding new element when length is zero.")
        public void testaddingWhenLengthIsZero() {
            String expected = "Element 2";
            LinkedList<String> list = linkedList;
            list.clear();

            list.add(expected);
            String headValue = list.getFirst().getValue();
            String tailValue = list.getLast().getValue();
            String value = list.get(0).getValue();

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
        list.add(5);
        list.add(1);
        list.add(7);

        assertEquals(4, list.size());
    }

    /**
     * Test case to verify if the correct item is removed from the head of the linked list.
     */
    @Test
    @DisplayName("Test if the correct item is removed from the head")
    public void testRemoveFirstItem() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.add(5);
        list.add(1);
        list.add(7);
        list.removeFirst();
        Integer headData = list.getFirst().getValue();
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
        list.add(5);
        list.add(1);
        list.add(7);
        list.removeLast();
        Integer tailData = list.getLast().getValue();
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
            list.add(5);
            list.add(1);
            list.add(7);
            list.remove(0);
            Integer headData = list.get(0).getValue();
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
            list.add(5);
            list.add(1);
            list.add(7);
            list.remove(0);
            Integer headData = list.getFirst().getValue();
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
            list.add(5);
            list.add(1);
            list.add(7);
            int removeIndex = list.size() - 1;
            list.remove(removeIndex);

            Integer tailData = list.getLast().getValue();
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
            list.add(5);
            list.add(1);
            list.add(7);

            list.insert(15,2 );

            Integer insertedData = list.get(2).getValue();

            assertEquals(15,insertedData);
        }

        /**
         * Test case to verify if false is returned when invalid index values are passed to insert method.
         */
        @Test
        @DisplayName("Test if false is returned when invalid index values are passed")
        public void testInsertItemWithInvalidIndexValues() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertFalse(list.insert(15,-1));
            assertFalse(list.insert(15,3));
        }

        /**
         * Test case to verify if true is returned when inserting an item at index 0.
         */
        @Test
        @DisplayName("Test if true is returned when inserting an item at index 0")
        public void testInsertItemAtIndexZero() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertTrue(list.insert( 15,0));
            assertEquals(15, list.getFirst().getValue());
        }

        /**
         * Test case to verify if true is returned when inserting an item at the tail (length-1) index.
         */
        @Test
        @DisplayName("Test if true is returned when inserting an item at the tail index")
        public void testInsertItemAtTailIndex() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertTrue(list.insert(15,list.size() - 1));
            assertEquals(10, list.getLast().getValue());
        }
    }

    /**
     * Test case to verify if the correct item is set at a defined position in the linked list.
     */
    @Test
    @DisplayName("Test setting an item at a defined position")
    public void testSetItem() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.add(5);
        list.add(1);
        list.add(7);

        list.set( 15,2);

        Integer setData = list.get(2).getValue();
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
        list.add(5);
        list.add(1);
        list.add(7);

        list.prepend(15);

        Integer headData = list.get(0).getValue();
        Integer expected = 15;

        assertEquals(headData, expected);
    }
}
