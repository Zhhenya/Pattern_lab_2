package Properties.FlyProperties;

public class FlyWithWings implements Fly {
    @Override
    public int fly(int speed) {
        System.out.println("Fly with wings");
        return 0;
    }
}
