package Properties.BreakProperties;

public class BreakByPlayer implements BreakDown {
    @Override
    public void toHarm(String namePlayer) {
        System.out.println("The player hit the ball");
    }
}
