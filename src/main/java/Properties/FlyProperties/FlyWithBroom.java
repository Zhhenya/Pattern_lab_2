package Properties.FlyProperties;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class FlyWithBroom extends Pane implements Fly {
    private int speed;
    private Image image;
    private Pane pane = new Pane();



    @Override
    public void fly() {
        System.out.println("Fly with Broom");
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
        ImageView imageView  = new ImageView(image);
        imageView.setLayoutX(350);
        pane.getChildren().add(imageView);
    }

    public Pane getPane() {
        return pane;
    }


}
