package MagicAtributes;


import Box.BoxIterator;
import Properties.*;

public class Bladger extends ActionsForBalls implements MagicAttributes {
    public Bladger(){}

    @Override
    public MagicAttributes setDangerous(int dangerous) {
        this.dangerous = dangerous;
        return this;
    }

    @Override
    public int getDangerous() {
        return dangerous;
    }

    @Override
    public String getBallName() {
        return super.getBallName();
    }

    @Override
    public void setBallName(String ballName) {
        super.setBallName(ballName);
    }

    @Override
    public int getBallSize() {
        return getBallProperties().getBallSize();
    }

    @Override
    public BoxIterator createBoxIterator() {
        return null;
    }

}
