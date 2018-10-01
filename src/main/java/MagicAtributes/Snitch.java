package MagicAtributes;

import Properties.ActionsForBalls;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyWithWings;
import Properties.KillProperties.KillWithABall;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Snitch extends ActionsForBalls implements MagicAttributes{
    public Snitch(){
        setBallName("Snitch");
        setBallSize(10);
        setDangerous(1);
        setPoints(150);
        imageView = new ImageView(new Image("characters/balls/snitch1.gif"));
        fly = new FlyWithWings();
        breakDown = new BreakByBall();
        tryKillPlayer = new KillWithABall();


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
    public Snitch setDangerous(int dangerous) {
        this.dangerous = dangerous;
        return this;
    }

    @Override
    public Snitch setPoints(int points) {
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
}
