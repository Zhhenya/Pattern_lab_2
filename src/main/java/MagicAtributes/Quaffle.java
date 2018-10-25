package MagicAtributes;

import Box.BoxIterator;
import Properties.ActionsForBalls;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyForBall;
import Properties.KillProperties.KillWithABall;

public class Quaffle extends ActionsForBalls implements MagicAttributes {
    public Quaffle(){
    }

    @Override
    public MagicAttributes setDangerous(int dangerous) {
        this.dangerous = dangerous;
        return this;
    }

    @Override
    public int getBallSize() {
        return getBallProperties().getBallSize();
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
    public BoxIterator createBoxIterator() {
        return null;
    }
}
