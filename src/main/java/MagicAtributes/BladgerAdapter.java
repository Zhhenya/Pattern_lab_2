package MagicAtributes;

public class BladgerAdapter extends Bladger {
    Bladger bladger;

    public  BladgerAdapter(Bladger bladger){
        this.bladger = bladger;
    }

    @Override
    public int getBallSize() {
        bladger.setBallSize(bladger.getBallSize() - 1);
        return super.getBallSize();
    }
}