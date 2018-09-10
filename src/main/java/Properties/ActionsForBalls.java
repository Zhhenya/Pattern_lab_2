package Properties;

import Properties.BreakProperties.BreakDown;
import Properties.FlyProperties.Fly;
import Properties.KillProperties.TryKillPlayer;

public class ActionsForBalls {
    private double ballSize;
    private int points;
    private int dangerous;
    private String ballName;

    protected Fly fly;
    protected BreakDown breakDown;
    protected TryKillPlayer tryKillPlayer;

    public double getBallSize() {
        return ballSize;
    }

    public int getDangerous() {
        return dangerous;
    }

    public int getPoints() {
        return points;
    }

    public String getBallName() {
        return ballName;
    }

    protected void setBallSize(double ballSize) {
        this.ballSize = ballSize;
    }

    protected void setDangerous(int dangerous) {
        this.dangerous = dangerous;
    }

    protected void setPoints(int points) {
        this.points = points;
    }

    protected void setBallName(String ballName) {
        this.ballName = ballName;
    }

    public void actionFly() {
        fly.fly();
    }

    public void actionBreakDown(String namePlayer){
        breakDown.toHarm(namePlayer);
    }

    public void actionTryKill(String nameKiller){
        tryKillPlayer.kill(nameKiller);
    }
}
