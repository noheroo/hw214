package Data;

public class StringListElements {
    private String[] elements;
    private static final String[] EMPTY_ELEMENTS = {};

    public int length() {
        return elements.length;

    }

    public String getElement(int index) {
        return elements[index];
    }

    public String setElement(int index, String element) {
        return elements[index];
    }

    public StringListElements(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new String[initialCapacity];
        } else {
            this.elements = EMPTY_ELEMENTS;
        }
    }
}
