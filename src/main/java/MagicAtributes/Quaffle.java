package MagicAtributes;

import Properties.ActionsForBalls;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyForBall;
import Properties.KillProperties.KillWithABall;

public class Quaffle extends ActionsForBalls {
    public Quaffle(){
        fly = new FlyForBall();
        breakDown = new BreakByBall();
        tryKillPlayer = new KillWithABall();
        setBallName("Quaffle");
        setBallSize(30);
        setPoints(10);
        setDangerous(3);
    }
}
