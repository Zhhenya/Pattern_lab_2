package Characters;

public class HealthAdapterForPlayer extends Catcher {
    Character catcher;
    public HealthAdapterForPlayer(Character catcher){
        this.catcher = catcher;
    }

    public Character addHealth(){
        if(catcher.getHealth() < 3)
            catcher.setHealth(catcher.getHealth() + 3);
        return catcher;
    }
}