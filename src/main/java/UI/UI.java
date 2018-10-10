package UI;

import Box.BoxIterator;
import Characters.Character;
import MagicAtributes.MagicAttributes;

public interface UI {
    void initialize();
    void firstFrame();
    void secondFrame();
    void afterSecondFrame();
    void thirdFrame();
    void forthFrame();
    void fifthFrame();
    void sixFrame();
    void getInfoAboutPlayer(Character character);
    void getInfoAboutBall(MagicAttributes ball);
    void findAllMagicAttributes(BoxIterator boxIterator);
}
