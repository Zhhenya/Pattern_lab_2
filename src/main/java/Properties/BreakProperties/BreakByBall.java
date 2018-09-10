package Properties.BreakProperties;

public class BreakByBall implements BreakDown {
    @Override
    public void toHarm(String namePlayer) {
        System.out.println("The ball injured the player " + namePlayer);
    }
}
