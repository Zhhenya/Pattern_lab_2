package MagicAtributes;

import Box.BoxIterator;
import javafx.scene.image.ImageView;

public class DecoratorForBalls implements MagicAttributes {
    MagicAttributes magicAttributes;


    public DecoratorForBalls(MagicAttributes magicAttributes){
        this.magicAttributes = magicAttributes;
    }

    @Override
    public void setBallName(String name) {
        magicAttributes.setBallName(name);
    }


    @Override
    public MagicAttributes setDangerous(int dangerous) {
        magicAttributes.setDangerous(dangerous);
        return magicAttributes;
    }

    @Override
    public void setBallProperties(BallProperties ballProperties) {

    }

    @Override
    public int getBallSize() {
        return 0;
    }

    @Override
    public int getDangerous() {
        return 0;
    }

    @Override
    public int getPoints() {
        return 0;
    }

    @Override
    public String getBallName() {
        return null;
    }

    @Override
    public ImageView getImageView() {
        return null;
    }

    @Override
    public void setImageView(ImageView imageView) {

    }

    @Override
    public BoxIterator createBoxIterator() {
        return null;
    }


}