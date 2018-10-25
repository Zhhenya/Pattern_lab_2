package Outfit.broom;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AdvancedBroom implements Broom {

    public ImageView getImageView() {
        return imageView;
    }

    ImageView imageView;
    int speed;

    @Override
    public void hasExtraSpeed() {
        this.speed = 10;
        imageView = new ImageView(new Image("broom/advancedBroom.jpg"));
    }
}