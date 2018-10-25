package Outfit.cloak;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class SimpleCloak implements Cloak{

    ImageView imageView;
    int protect;

    @Override
    public void hasProtected() {
        this.protect = 0;
        imageView = new ImageView(new Image("cloak/simpleCloak.png"));
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getProtect() {
        return protect;
    }
}