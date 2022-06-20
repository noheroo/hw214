package Implements;

import Exceptions.BadIndexException;
import Exceptions.ItemIsNullException;
import org.junit.jupiter.api.Test;

import static Implements.Constants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringListImplTest {

    private final StringListImpl out = new StringListImpl();

    @Test
    void addElementWithoutIndex() {
        assertEquals(out.add(S), S);

    }

    @Test
    void testAddElementByIndex() {
        out.add(S1);
        assertEquals(out.add(1, S), S);
    }

    @Test
    void setElementByIndex() {
        out.add(S);
        assertEquals(out.set(0, S1), S1);
    }

    @Test
    void removeElementByIndex() {
        out.add(S1);
        assertEquals(out.remove(0), S1);
    }

    @Test
    void testRemoveWithoutIndex() {
        out.add(S);
        assertEquals(out.remove(S), S);
    }

    @Test
    void containsElementByItem() {
        out.add(S);
        assertEquals(out.contains(S), TRUE);
        assertEquals(out.contains(S1), FALSE);
    }

    @Test
    void indexOf() {
        out.add(S);
        out.add(S1);

        assertEquals(out.indexOf(S1),ONE);
    }

    @Test
    void lastIndexOf() {
        out.add(S);
        out.add(S1);

        assertEquals(out.indexOf(S1),ONE);
    }

    @Test
    void get() {
        out.add(S);
        out.add(S1);

        assertEquals(out.get(ONE), S1);
    }


    @Test
    void size() {
        out.add(S);
        out.add(S1);

        assertEquals(out.size(),TWO);
    }

    @Test
    void isEmpty() {
        assertEquals(out.isEmpty(),TRUE);
    }

    @Test
    void ItemIsNullException() {
        assertThrows(ItemIsNullException.class, () -> out.add(null));
    }

    @Test
    void BadIndexException() {
        assertThrows(BadIndexException.class, () -> out.add(-5,S));
    }
}