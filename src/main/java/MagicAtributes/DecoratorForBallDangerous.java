package MagicAtributes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DecoratorForBallDangerous extends DecoratorForBalls {
    public DecoratorForBallDangerous(MagicAttributes magicAttributes) {
        super(magicAttributes);
    }

    @Override
    public MagicAttributes setDangerous(int dangerous) {
        addDangerous(dangerous);
        return magicAttributes;
    }


    public MagicAttributes addDangerous(int dangerous)
    {
        if(dangerous + 1 > 3){
            magicAttributes.setImageView(new ImageView(new Image("characters/balls/snitch3.gif")));
            magicAttributes.getImageView().setLayoutX(50);
            magicAttributes.getImageView().setLayoutY(-20);
        }
        return magicAttributes.setDangerous(dangerous++);
    }
}