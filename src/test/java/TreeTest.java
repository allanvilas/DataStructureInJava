import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Nested;

import datastructure.DataStructures.Tree;

public class TreeTest {

    Tree<Integer> tree = new Tree<>(10);
    
    @Nested
    class TreeNewInstanceTests {
        @Test
        @DisplayName("Test left and right node iniatlize as null when instancing a new tree")
        public void testNewInstancedTreeRootNodeLeftRightIsNull(){
            Tree<Integer> tree = new Tree<>(10);

            assertNull(tree.root.getLeft());
            assertNull(tree.root.getRight());
        }
    }

    @Test
    @DisplayName("Test if a node is leaf when might be")
    public void testIfNodeIsLeaf() {
        Tree<Integer> tree = this.tree;
        assertTrue(tree.root.isLeaf());
    }

    @Test 
    @DisplayName("Insert new Item on first open position")
    public void testInsertigNewItem() {
        Tree<Integer> tree = this.tree;

        tree.insert(15);

        assertEquals(tree.root.getLeft().getValue(), 15);
    }

    @Test
    @DisplayName("Test if new inserted item is leaf")
    public void testNewInsertedItemLeaf() {
        Tree<Integer> tree = this.tree;

        tree.insert(15);

        assertTrue(tree.root.getLeft().isLeaf());
    }

    @Test
    @DisplayName("Test if preOrder return items ordered")
    public void testPreOrderOrdering() {
        Tree<Integer> tree = this.tree;
         ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(10, 15, 25, 2));
        tree.insert(15);
        tree.insert(2);
        tree.insert(25);
        assertArrayEquals(expectedArray.toArray(),tree.preOrder().toArray());
    }

    @Test
    @DisplayName("Test if inOrder return items ordered")
    public void testInOrderOrdering() {
        Tree<Integer> tree = this.tree;
         ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(25, 15, 10, 2));
        tree.insert(15);
        tree.insert(2);
        tree.insert(25);
        assertArrayEquals(expectedArray.toArray(),tree.inOrder().toArray());
    }

    @Test
    @DisplayName("Test if posOrder return items ordered")
    public void testposOrderOrdering() {
        Tree<Integer> tree = this.tree;
         ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(25, 15, 2, 10));
        tree.insert(15);
        tree.insert(2);
        tree.insert(25);
        assertArrayEquals(expectedArray.toArray(),tree.posOrder().toArray());
    }

    @Test
    @DisplayName("Test BFS algorithm")
    public void testBFSAlg() {
        Tree<Integer> tree = this.tree;
        tree.insert(15);
        tree.insert(2);
        tree.insert(25);
        tree.insert(14);
        tree.insert(3);
        tree.insert(29);
        int expectedValue = tree.BFS(14).getValue();
        assertEquals(14,expectedValue);
    }
}
