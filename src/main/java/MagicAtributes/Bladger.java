package MagicAtributes;


import Properties.*;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyForBall;
import Properties.KillProperties.KillWithABall;

public class Bladger extends ActionsForBalls {
    public Bladger(){
        fly = new FlyForBall();
        breakDown = new BreakByBall();
        tryKillPlayer = new KillWithABall();
        setBallName("Bladger");
        setBallSize(25);
        setDangerous(10);
        setPoints(0);
    }
}
