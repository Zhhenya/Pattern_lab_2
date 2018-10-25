package MagicAtributes;

import Box.BoxIterator;
import Properties.ActionsForBalls;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyWithWings;
import Properties.KillProperties.KillWithABall;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Snitch extends ActionsForBalls implements MagicAttributes{
    public Snitch(){
        imageView = new ImageView(new Image("characters/balls/snitch1.gif"));
    }

    @Override
    public ImageView getImageView() {
        return super.getImageView();
    }

    @Override
    public void setImageView(ImageView imageView) {
        super.setImageView(imageView);
    }

    @Override
    public MagicAttributes setDangerous(int dangerous) {
        this.dangerous = dangerous;
        return this;
    }

    @Override
    public int getBallSize() {
        return getBallProperties().getBallSize();
    }

    @Override
    public int getDangerous() {
        return dangerous;
    }

    @Override
    public String getBallName() {
        return super.getBallName();
    }

    @Override
    public void setBallName(String ballName) {
        super.setBallName(ballName);
    }

    @Override
    public BoxIterator createBoxIterator() {
        return null;
    }
}
