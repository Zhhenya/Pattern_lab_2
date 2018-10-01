package MagicAtributes;

import Box.BoxIterator;

public interface MagicAttributes {
    void setBallName(String name);
    void setBallSize(int ballSize);
    MagicAttributes setDangerous(int dangerous);
    MagicAttributes setPoints(int points);

    int getBallSize();
    int getDangerous();
    int getPoints();
    String getBallName();


    //BoxIterator createBoxIterator();

}