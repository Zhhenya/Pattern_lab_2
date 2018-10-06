package Box;

import MagicAtributes.MagicAttributes;

public class BoxIterator implements Iterator {
    private BoxForMagicAttributes box;
    private int currentPosition = 0;


    public void setBoxForMagicAttributes(BoxForMagicAttributes box){
        this.box = box;
    }

    public BoxForMagicAttributes getBox() {
        return box;
    }

    @Override
    public boolean hasNext() {
        if(currentPosition < box.getMagicAttributes().size())
            return true;
        return false;
    }

    @Override
    public MagicAttributes getNext() {
        if(hasNext())
            return box.getMagicAttributes().get(currentPosition++);
        return null;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}