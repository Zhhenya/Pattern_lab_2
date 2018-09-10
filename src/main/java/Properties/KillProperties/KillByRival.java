package Properties.KillProperties;



public class KillByRival implements TryKillPlayer {//действие: исключить игрока соперником
    @Override
    public void kill(String nameKiller) {
        System.out.println(nameKiller + " kill by rival ");
    }
}
