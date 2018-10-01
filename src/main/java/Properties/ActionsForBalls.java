package Properties;

import Properties.BreakProperties.BreakDown;
import Properties.FlyProperties.Fly;
import Properties.KillProperties.TryKillPlayer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ActionsForBalls {
    public int ballSize;
    public int points;
    public int dangerous;
    public String ballName;
    public int startSpeed;
    protected Fly fly;
    protected BreakDown breakDown;
    protected TryKillPlayer tryKillPlayer;
    public ImageView imageView;

   /* public int getBallSize() {
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
    }*/

 /*   protected void setBallSize(double ballSize) {
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
    }*/

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
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
