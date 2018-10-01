package MagicAtributes;

public class DecoratorForBallDangerous extends DecoratorForBalls {
    public DecoratorForBallDangerous(MagicAttributes magicAttributes) {
        super(magicAttributes);
    }

    @Override
    public MagicAttributes setDangerous(int dangerous) {
        addDangerous(dangerous);
        return magicAttributes;
    }


    public MagicAttributes addDangerous(int dangerous){
        return magicAttributes.setDangerous(dangerous++);
    }
}