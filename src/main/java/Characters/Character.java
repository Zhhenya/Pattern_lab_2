package Characters;

import Properties.ActionsForBalls;
import Properties.BreakProperties.BreakByBall;
import Properties.BreakProperties.BreakByPlayer;
import Properties.BreakProperties.BreakDown;
import Properties.FlyProperties.Fly;
import Properties.FlyProperties.FlyWithBroom;
import Properties.KillProperties.KillByRival;
import Properties.KillProperties.TryKillPlayer;
import Teams.Team;

public class Character{
    protected String nameCharacterPosition;
    private String namePlayer;
    protected TryKillPlayer tryKillPlayer = new KillByRival();
    protected BreakDown breakByPlayer = new BreakByPlayer();
    protected Fly fly = new FlyWithBroom();


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
