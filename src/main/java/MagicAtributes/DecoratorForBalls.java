package MagicAtributes;

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
    public void setBallSize(int ballSize) {
        magicAttributes.setBallSize(ballSize);
    }

    @Override
    public MagicAttributes setDangerous(int dangerous) {
        magicAttributes.setDangerous(dangerous);
        return magicAttributes;
    }

    @Override
    public MagicAttributes setPoints(int points) {
        magicAttributes.setPoints(points);
        return magicAttributes;
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


}