package Inventory.Iterator;

import Inventory.MagicAttributes;

public interface MagicAttributeIterator {
    MagicAttributes getNext();
    boolean hasNext();
    void remove();
}
