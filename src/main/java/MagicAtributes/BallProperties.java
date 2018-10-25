package MagicAtributes;

import Properties.BreakProperties.BreakByBall;
import Properties.BreakProperties.BreakDown;
import Properties.FlyProperties.Fly;
import Properties.FlyProperties.FlyForBall;
import Properties.KillProperties.KillWithABall;
import Properties.KillProperties.TryKillPlayer;

public class BallProperties {
    private Fly fly;
    private BreakDown breakDown ;
    private TryKillPlayer tryKillPlayer;
    public int ballSize;
    private int points;

    public BallProperties(Fly fly, BreakDown breakDown, TryKillPlayer tryKillPlayer, int ballSize, int points){
        this.fly = fly;
        this.breakDown = breakDown;
        this.tryKillPlayer = tryKillPlayer;
        this.ballSize = ballSize;
        this.points = points;
    }

    public Fly getFly() {
        return fly;
    }

    public BreakDown getBreakDown() {
        return breakDown;
    }

    public TryKillPlayer getTryKillPlayer() {
        return tryKillPlayer;
    }

    public int getBallSize() {
        return ballSize;
    }

    public int getPoints() {
        return points;
    }
}