package Characters;

import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Beater extends Character{ //загонщик
    public Beater(ImageView imageView, Duration duration, int numberOfFrames, int numberOfColumns, double offsetX, double offsetY, double width, double height){
        super(imageView, duration, numberOfFrames, numberOfColumns, offsetX, offsetY, width, height);
        nameCharacterPosition = "Beater";
    }

}
