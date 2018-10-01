package Box;

import MagicAtributes.MagicAttributes;

public interface Iterator {
    boolean hasNext();
    MagicAttributes getNext();
    void reset();
}