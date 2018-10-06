package MagicAtributes;


import Box.BoxIterator;
import Properties.*;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyForBall;
import Properties.KillProperties.KillWithABall;

public class Bladger extends ActionsForBalls implements MagicAttributes {
    public Bladger(){
        fly = new FlyForBall();
        breakDown = new BreakByBall();
        tryKillPlayer = new KillWithABall();
        setBallName("Bladger");
        setBallSize(35);
        setDangerous(10);
        setPoints(0);
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
    public Bladger setDangerous(int dangerous) {
        this.dangerous = dangerous;
        return this;
    }

    @Override
    public Bladger setPoints(int points) {
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
