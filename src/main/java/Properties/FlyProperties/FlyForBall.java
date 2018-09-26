package Properties.FlyProperties;

import javafx.scene.image.Image;

public class FlyForBall implements Fly {
    Image image = new Image("bal.jpg");

    @Override
    public int fly(int speed) {
        System.out.println("The ball if flying right now");
        return speed;
    }
}
