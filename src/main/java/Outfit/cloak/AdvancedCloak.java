package Outfit.cloak;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class AdvancedCloak implements Cloak {
    ImageView imageView;
    int protect;


    @Override
    public void hasProtected() {
        this.protect = 10;
        imageView = new ImageView(new Image("cloak/advancedCloak.jpg"));
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getProtect() {
        return protect;
    }
}