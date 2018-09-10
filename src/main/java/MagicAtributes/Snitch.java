package MagicAtributes;

import Properties.ActionsForBalls;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyWithWings;
import Properties.KillProperties.KillWithABall;

public class Snitch extends ActionsForBalls{
    public Snitch(){
        setBallName("Snitch");
        setBallSize(10);
        setDangerous(1);
        setPoints(150);
        fly = new FlyWithWings();
        breakDown = new BreakByBall();
        tryKillPlayer = new KillWithABall();


    }
}
