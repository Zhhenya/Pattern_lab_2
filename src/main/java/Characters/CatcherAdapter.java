package Characters;

public class CatcherAdapter extends Catcher {
    Catcher catcher;
    public CatcherAdapter(Catcher catcher){
        this.catcher = catcher;
    }

    public Catcher addHealth(){
        if(catcher.getHealth() < 3)
            catcher.setHealth(catcher.getHealth() + 3);
        return catcher;
    }
}