package MagicAtributes;

import Box.BoxIterator;
import javafx.scene.image.ImageView;

public interface MagicAttributes {
    void setBallName(String name);
    void setBallSize(int ballSize);
    MagicAttributes setDangerous(int dangerous);
    MagicAttributes setPoints(int points);

    int getBallSize();
    int getDangerous();
    int getPoints();
    String getBallName();


    ImageView getImageView();
    void setImageView(ImageView imageView);

    BoxIterator createBoxIterator();

}