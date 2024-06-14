

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import datastructure.DataStructures.LinkedList;

public class LinkedListTest {

    LinkedList linkedList = new LinkedList("Element 1");

    @Test
    public void InstanceNewLinkedList() {
        
        String expected = "Element 1";
        String LikedListValue = linkedList.get(0).getData();
        assertEquals(expected,LikedListValue);
    }

    @
}
