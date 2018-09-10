package Properties.KillProperties;

public class KillWithABall implements TryKillPlayer {
    @Override
    public void kill(String nameKiller) {
        System.out.println("Kill by ball " + nameKiller);
    }
}
