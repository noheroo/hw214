package Implements;

import Data.StringListElements;
import Exceptions.ArrayIsFullException;
import Exceptions.BadIndexException;
import Exceptions.ItemNotFoundException;
import Exceptions.ThisCellIsNotEmptyException;
import Interfaces.StringList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringListImpl implements StringList {

    StringListElements strings = new StringListElements(0);


    @Override
    public String add(String item) {
        for (int i = 0; i < strings.length(); i++) {
            if (strings.getElement(i) == null) {
                strings.setElement(i, item);
                return item;
            }
        }
        throw new ArrayIsFullException();
    }

    @Override
    public String add(int index, String item) {
        if (index > strings.length()) {
            throw new BadIndexException();
        }
        if (strings.getElement(index) == null) {
            strings.setElement(index, item);
            return item;
        } else {
            throw new ThisCellIsNotEmptyException();
        }
    }

    @Override
    public String set(int index, String item) {
        if (index > strings.length() && index > size()) {
            throw new BadIndexException();
        }
        strings.setElement(index, item);
        return item;
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < strings.length(); i++) {
            if (strings.getElement(i).equals(item)) {
                return strings.setElement(i, null);
            }
        }
        throw new ItemNotFoundException();
    }

    @Override
    public String remove(int index) {
        if (index > size()) {
            throw new BadIndexException();
        }
        return strings.setElement(index, null);
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < strings.length(); i++) {
            if (strings.getElement(i).equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < strings.length(); i++) {
            if (strings.getElement(i).equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = strings.length(); i >= 0; i--) {
            if (strings.getElement(i).equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index > size()) {
            throw new BadIndexException();
        }
        return strings.getElement(index);
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        int quantity = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (strings.getElement(i) != null) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public boolean isEmpty() {
        int quantity = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (strings.getElement(i) != null) {
                quantity++;
            }
        }
        if (quantity == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < strings.length(); i++) {
            strings.setElement(i, null);
        }
    }

    @Override
    public String[] toArray() {
        return null;
    }

    public void printAll() {
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(strings.getElement(i));
        }
    }
}
