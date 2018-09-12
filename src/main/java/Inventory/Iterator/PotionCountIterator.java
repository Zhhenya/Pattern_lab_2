package Inventory.Iterator;

import Inventory.MagicAttributes;
import Inventory.Potion;

public class PotionCountIterator implements MagicAttributeIterator {
    private Potion potion;
    private int currentPosition = 0;

    public PotionCountIterator(Potion potion){
        this.potion = potion;
    }

    @Override
    public MagicAttributes getNext() {
        if(hasNext()) {
            MagicAttributes currentComponent = potion.getComponents().get(currentPosition++);
            return currentComponent;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < potion.getComponents().size();
    }

    @Override
    public void remove() {
        potion.getComponents().remove(currentPosition--);
    }

    public void setCurrentPosition(int currentPosition){
        this.currentPosition = currentPosition;
    }

}
