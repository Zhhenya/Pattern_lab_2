package Characters;

import Properties.BreakProperties.BreakByPlayer;
import Properties.BreakProperties.BreakDown;
import Properties.FlyProperties.Fly;
import Properties.FlyProperties.FlyWithBroom;
import Properties.KillProperties.KillByRival;
import Properties.KillProperties.TryKillPlayer;
import SpriteAnimation.SpriteAnimation;
import javafx.animation.Animation;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Character extends Pane {

    protected String nameCharacterPosition;
    private String namePlayer;
    private TryKillPlayer tryKillPlayer = new KillByRival();
    private BreakDown breakByPlayer = new BreakByPlayer();
    protected Fly fly = new FlyWithBroom();
    public Animation spriteAnimation;

    public void moveX(double x){
        boolean right =  x > 0 ? true : false;
        for(int i = 0; i < Math.abs(x); i++){
            if(right)
                this.setTranslateX(this.getTranslateX() + 1);
            else
                this.setTranslateX(this.getTranslateX() - 1);
        }
    }

    public void moveY(double y){
        boolean down = y > 0 ? true : false;
        for(int i = 0; i < Math.abs(y); i++){
            if(down)
                this.setTranslateY(this.getTranslateY() + 1);
            else
                this.setTranslateY(this.getTranslateY() - 1);
        }
    }

    public Character(ImageView imageView, Duration duration, int numberOfFrames, int numberOfColumns, double offsetX, double offsetY, double width, double height) {
        spriteAnimation = new SpriteAnimation(imageView, duration, numberOfFrames, numberOfColumns, offsetX, offsetY, width, height);
        getChildren().add(imageView);
    }

    public ImageView getImageView(){
        return ((SpriteAnimation) spriteAnimation).getImageView();
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
