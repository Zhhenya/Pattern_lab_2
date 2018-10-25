package Outfit.broom;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class SimpleBroom implements Broom {

    public ImageView getImageView() {
        return imageView;
    }

    ImageView imageView;
    int speed;

    @Override
    public void hasExtraSpeed() {
        speed = 0;
        imageView = new ImageView(new Image("broom/simpleBroom.jpg"));
    }
}