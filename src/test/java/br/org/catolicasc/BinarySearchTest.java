package br.org.catolicasc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BinarySearchTest {

    private int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

    @Test
    void testRecursiveSearch() {
        int index = new RecursiveBinarySearch(10, values)
                .search();
        assertEquals(9, index);
    }

    @Test
    void testNormalSearch() {
        int index  = BinarySearch.indexOf(values, 10);
        assertEquals(9, index);
    }

}
