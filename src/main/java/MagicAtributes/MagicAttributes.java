package MagicAtributes;

import Box.BoxIterator;
import javafx.scene.image.ImageView;

public interface MagicAttributes {
    void setBallName(String ballName);
    MagicAttributes setDangerous(int dangerous);
    void setBallProperties(BallProperties ballProperties);

    int getBallSize();
    int getDangerous();
    int getPoints();
    String getBallName();


    ImageView getImageView();
    void setImageView(ImageView imageView);

    BoxIterator createBoxIterator();

}