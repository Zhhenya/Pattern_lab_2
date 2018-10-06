package MagicAtributes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DecoratorForBallsDangerousMinus extends DecoratorForBalls{
    public DecoratorForBallsDangerousMinus(MagicAttributes magicAttributes) {
        super(magicAttributes);
    }

    @Override
    public MagicAttributes setDangerous(int dangerous) {
        addDangerous(dangerous);
        return magicAttributes;
    }


    public MagicAttributes addDangerous(int dangerous){
        if(dangerous - 4 < 0)
            magicAttributes.setImageView(new ImageView(new Image("characters/balls/snitch1.gif")));
        return magicAttributes.setDangerous(dangerous-4);
    }
}