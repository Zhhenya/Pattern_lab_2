package Properties.Decorator;

import Properties.FlyProperties.Fly;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class FlyDecorator implements Fly {

    private Fly flyObject;
    private int speed;

    public FlyDecorator(int speed){
        this.speed = speed;
    }

    public FlyDecorator(Fly flyObject){
        this.flyObject = flyObject;
    }

    @Override
    public int fly(int addSpeed) {
        System.out.println("Fly more faster");
        changeFly();
        return flyObject.fly(this.speed + addSpeed);
    }


    public void changeFly()
            flyObject.getPane().getChildren().remove(pane.getChildren().size() - 1);
            setImage(image);
    }
}