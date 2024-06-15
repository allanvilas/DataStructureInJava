
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import datastructure.DataStructures.LinkedList;

public class LinkedListTest {

    LinkedList<String> linkedList = new LinkedList<>("Element 1");

    @Test
    @DisplayName("Test getting element from linked list")
    public void testFetchingElement() {
        String expected = "Element 1";
        LinkedList<String> list = linkedList;
        String LikedListValue = list.get(0).getData();
        assertEquals(expected, LikedListValue);
    }

    @Test
    @DisplayName("Test if list return null after making it empty.")
    public void testIsListEmpty() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.makeEmpty();
        assertNull(list.get(0));
    }

    /**
     * LinkedListAppendTestsst
     */
    @Nested
    class LinkedListAppendTests {
        @Test
        @DisplayName("Test appending new element")
        public void testAppendingNewValue() {
            String expected = "Element 2";
            LinkedList<String> list = linkedList;

            list.append(expected);
            String value = list.get(1).getData();
            assertEquals(value, expected);
        }

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

    @Test
    @DisplayName("Get the lenght of the linked list")
    public void testListLenght() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.append(5);
        list.append(1);
        list.append(7);

        assertEquals(4, list.getLength());
    }

    @Test
    @DisplayName("Test if the corret item is removed from head")
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

    @Test
    @DisplayName("Test if the corret item is removed from tail")
    public void testRemoveLastItem() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.append(5);
        list.append(1);
        list.append(7);
        list.removeLast();
        Integer headData = list.getTail().getData();
        Integer expected = 1;

        assertEquals(headData, expected);
    }

    @Nested
    class LinkedListRemoveTests {
        @Test
        @DisplayName("Test if the corret item is removed from defined position")
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

        @Test
        @DisplayName("Test if when 0 is passed as param the statement will invoke removeFirst")
        public void testRemoveItemWhenZeroPassedOnParam() {
            LinkedList<Integer> list = new LinkedList<>(10);
            list.append(5);
            list.append(1);
            list.append(7);
            list.remove(0);
            Integer headData = list.getHead().getData();
            Integer expected = 5;

            assertEquals(headData, expected);
        }

        @Test
        @DisplayName("Test if the corret item is removed from defined position")
        public void testRemoveItemWhenLastIndexIsPassedOnParam() {
            LinkedList<Integer> list = new LinkedList<>(10);
            list.append(5);
            list.append(1);
            list.append(7);
            int removeIndex = list.getLength() - 1;
            list.remove(removeIndex);

            Integer headData = list.getTail().getData();
            Integer expected = 1;

            assertEquals(headData, expected);
        }
    }

    @Nested
    /**
     * LinkedListInsertItemTests
     */
    public class LinkedListInsertItemTests {
        @Test
        @DisplayName("Test if the corret item is removed from defined position")
        public void testInsertItem() {
            LinkedList<Integer> list = new LinkedList<>(10);
            list.append(5);
            list.append(1);
            list.append(7);

            list.insert(2, 15);

            Integer headData = list.get(2).getData();
            Integer expected = 15;

            assertEquals(headData, expected);
        }

        @Test
        @DisplayName("Test if false is returned when -1 or > linked list length value is passed as index param")
        public void testInsertItemWithWrongValuesAsIndex() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertFalse(list.insert(-1, 15));
            assertFalse(list.insert(3, 15));
        }

        @Test
        @DisplayName("Test if false is returned when zero is passed as Index param")
        public void testInsertItemWithZeroAsIndexParam() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertTrue(list.insert(0, 15));
            assertEquals(15, list.getHead().getData());
        }

        @Test
        @DisplayName("Test if false is returned when zero is passed as Index param")
        public void testInsertItemOnTailPassingLengthAsIndex() {
            LinkedList<Integer> list = new LinkedList<>(10);
            assertTrue(list.insert(list.getLength() - 1, 15));
            assertEquals(10, list.getTail().getData());
        }
    }

    @Test
    @DisplayName("Test if the corret item is removed from defined position")
    public void testSetItem() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.append(5);
        list.append(1);
        list.append(7);

        list.set(2, 15);

        Integer headData = list.get(2).getData();
        Integer expected = 15;

        assertEquals(headData, expected);
    }

    @Test
    @DisplayName("Test if the corret item is removed from defined position")
    public void testAddingItemOnTail() {
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
