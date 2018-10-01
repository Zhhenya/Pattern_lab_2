package Characters;

import Properties.BreakProperties.BreakByPlayer;
import Properties.BreakProperties.BreakDown;
import Properties.FlyProperties.Fly;
import Properties.FlyProperties.FlyWithBroom;
import Properties.KillProperties.KillByRival;
import Properties.KillProperties.TryKillPlayer;
import SpriteAnimation.SpriteAnimation;
import javafx.animation.Animation;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Character {

    protected String nameCharacterPosition;
    private String namePlayer;
    private TryKillPlayer tryKillPlayer = new KillByRival();
    private BreakDown breakByPlayer = new BreakByPlayer();
    protected Fly fly;
    private ImageView imageView;
    private int health;

    public void setFly(Fly fly) {
        this.fly = fly;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int startSpeed;

    public ImageView getImage(){
        return imageView;
    }

    public void setImageView(ImageView imageView){
        this.imageView = imageView;
    }

    public String getNamePlayer(){
        return namePlayer;
    }

    public String getNameCharacterPosition(){
        return nameCharacterPosition;
    }

    public void setNamePlayer(String namePlayer){
        this.namePlayer = namePlayer;
    }

    public void kill(String namePlayer){
        tryKillPlayer.kill(namePlayer);
    }

    public void BreakByPlayer(String namePlayer){
        breakByPlayer.toHarm(namePlayer);
    }

    public void getFly(){
         fly.fly();
    }

    public void catchBall(String ballName, String playerName){
        System.out.println(playerName + " caught the " + ballName);
    }

    public void hitBall(String ballName, String playerName){
        System.out.println(playerName + " hit the " + ballName);
    }

    public void dodgeBall(String ballName, String playerName){
        System.out.println(playerName + " dodge the " + ballName);
    }

    public void goal(String playerName, String ballName, int ballPoints, String teamName){
        System.out.println(playerName + " goal " + ballName);
        System.out.println(teamName + " gets " + ballPoints + " points");
    }


}
