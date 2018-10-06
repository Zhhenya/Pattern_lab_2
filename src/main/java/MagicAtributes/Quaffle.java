package MagicAtributes;

import Box.BoxIterator;
import Properties.ActionsForBalls;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyForBall;
import Properties.KillProperties.KillWithABall;

public class Quaffle extends ActionsForBalls implements MagicAttributes {
    public Quaffle(){
        fly = new FlyForBall();
        breakDown = new BreakByBall();
        tryKillPlayer = new KillWithABall();
     /*   setBallName("Quaffle");
        setBallSize(30);
        setPoints(10);
        setDangerous(3);*/
    }

    @Override
    public void setBallName(String name) {
        this.ballName = name;
    }

    @Override
    public void setBallSize(int ballSizesize) {
        this.ballSize = ballSizesize;
    }

    @Override
    public Quaffle setDangerous(int dangerous) {
        this.dangerous = dangerous;
        return this;
    }

    @Override
    public Quaffle setPoints(int points) {
        this.points = points;
        return this;
    }

    @Override
    public int getBallSize() {
        return ballSize;
    }

    @Override
    public int getDangerous() {
        return dangerous;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public String getBallName() {
        return ballName;
    }

    @Override
    public BoxIterator createBoxIterator() {
        return null;
    }
}
