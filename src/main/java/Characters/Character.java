package Characters;

import MagicAtributes.MagicAttributes;
import Properties.BreakProperties.BreakByPlayer;
import Properties.BreakProperties.BreakDown;
import Properties.FlyProperties.Fly;
import Properties.FlyProperties.FlyWithBroom;
import Properties.KillProperties.KillByRival;
import Properties.KillProperties.TryKillPlayer;
import SpriteAnimation.SpriteAnimation;
import Teams.Team;
import javafx.animation.Animation;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public abstract class Character {

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

    public int catchBall(MagicAttributes ball, Team team){
        System.out.println(this.namePlayer + " поймал " + ball.getBallName());
        if(ball.getPoints() == 150) {
            team.countOfPoints += 150;
            System.out.println("Общий счет команды: " + team.countOfPoints);
            return ball.getPoints();
        }
        else
            return 0;
    }

    public void hitBall(String ballName, String playerName){
        System.out.println(playerName + " отбил " + ballName);
    }

    public void dodgeBall(String ballName, String playerName){
        System.out.println(playerName + " dodge the " + ballName);
    }

    public void goal(String playerName, MagicAttributes ball, Team team){
        System.out.println(playerName + " забил гол " + ball.getBallName());
        System.out.println(team.teamName + " получает " + ball.getPoints() + " points");
        team.countOfPoints += ball.getPoints();

        System.out.println("Общий счет команды: " + team.countOfPoints);
    }


}
