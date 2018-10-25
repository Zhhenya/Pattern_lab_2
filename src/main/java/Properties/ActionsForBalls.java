package Properties;

import MagicAtributes.BallProperties;
import MagicAtributes.Bladger;
import javafx.scene.image.ImageView;


public class ActionsForBalls {
    private String ballName;
    public int dangerous;
    BallProperties ballProperties;
    public ImageView imageView;

    public void setBallProperties(BallProperties ballProperties) {
        this.ballProperties = ballProperties;
    }

    public BallProperties getBallProperties() {
        return ballProperties;
    }

    public void setBallName(String ballName) {
        this.ballName = ballName;
    }

    public String getBallName() {
        return ballName;
    }

    public int getPoints() {
        return ballProperties.getPoints();
    }
    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public void actionFly() {
        ballProperties.getFly().fly();
    }

    public void actionBreakDown(String namePlayer){
        ballProperties.getBreakDown().toHarm(namePlayer);
    }

    public void actionTryKill(String nameKiller){
        ballProperties.getTryKillPlayer().kill(nameKiller);
    }
}
