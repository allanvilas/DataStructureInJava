package datastructure;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import datastructure.DataStructures.Tree;

/**
 * Test class for the Tree data structure.
 */
public class TreeTest {

    Tree<Integer> tree = new Tree<>(10);
    
    /**
     * Nested class for testing new instance creation of Tree.
     */
    @Nested
    class TreeNewInstanceTests {
        
        /**
         * Test case to verify left and right nodes are initialized as null when a new tree is instantiated.
         */
        @Test
        @DisplayName("Test left and right node initialize as null when instancing a new tree")
        public void testNewInstancedTreeRootNodeLeftRightIsNull() {
            Tree<Integer> tree = new Tree<>(10);
            
            assertNull(tree.root.getLeft());
            assertNull(tree.root.getRight());
        }
    }

    /**
     * Test case to verify if a node is a leaf node.
     */
    @Test
    @DisplayName("Test if a node is a leaf node")
    public void testIfNodeIsLeaf() {
        Tree<Integer> tree = new Tree<>(10);
        assertTrue(tree.root.isLeaf());
    }

    /**
     * Test case to insert a new item into the tree.
     */
    @Test 
    @DisplayName("Insert new item in the first open position")
    public void testInsertingNewItem() {
        Tree<Integer> tree = new Tree<>(10);

        tree.insert(15);

        assertEquals(15, tree.root.getLeft().getValue());
    }

    /**
     * Test case to verify if the newly inserted item is a leaf node.
     */
    @Test
    @DisplayName("Test if newly inserted item is a leaf node")
    public void testNewInsertedItemIsLeaf() {
        Tree<Integer> tree = new Tree<>(10);

        tree.insert(15);

        assertTrue(tree.root.getLeft().isLeaf());
    }

    /**
     * Test case to verify if pre-order traversal returns items in correct order.
     */
    @Test
    @DisplayName("Test if pre-order traversal returns items in correct order")
    public void testPreOrderOrdering() {
        Tree<Integer> tree = new Tree<>(10);
        ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(10, 15, 25, 2));
        tree.insert(15);
        tree.insert(2);
        tree.insert(25);
        assertArrayEquals(expectedArray.toArray(), tree.preOrder().toArray());
    }

    /**
     * Test case to verify if in-order traversal returns items in correct order.
     */
    @Test
    @DisplayName("Test if in-order traversal returns items in correct order")
    public void testInOrderOrdering() {
        Tree<Integer> tree = new Tree<>(10);
        ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(25, 15, 10, 2));
        tree.insert(15);
        tree.insert(2);
        tree.insert(25);
        assertArrayEquals(expectedArray.toArray(), tree.inOrder().toArray());
    }

    /**
     * Test case to verify if post-order traversal returns items in correct order.
     */
    @Test
    @DisplayName("Test if post-order traversal returns items in correct order")
    public void testPostOrderOrdering() {
        Tree<Integer> tree = new Tree<>(10);
        ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(25, 15, 2, 10));
        tree.insert(15);
        tree.insert(2);
        tree.insert(25);
        assertArrayEquals(expectedArray.toArray(), tree.posOrder().toArray());
    }

    /**
     * Test case to verify Breadth-First Search (BFS) algorithm in the tree.
     */
    @Test
    @DisplayName("Test Breadth-First Search (BFS) algorithm")
    public void testBFSAlgorithm() {
        Tree<Integer> tree = new Tree<>(10);
        tree.insert(15);
        tree.insert(2);
        tree.insert(25);
        tree.insert(14);
        tree.insert(3);
        tree.insert(29);
        int expectedValue = tree.BFS(14).getValue();
        assertEquals(14, expectedValue);
    }
}
