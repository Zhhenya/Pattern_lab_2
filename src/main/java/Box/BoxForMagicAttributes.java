package Box;

import MagicAtributes.MagicAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxForMagicAttributes implements MagicAttributes, Box {
    private List<MagicAttributes> magicAttributes = new ArrayList<>();
    private String boxName;

    public void add(MagicAttributes magicAttributes) {
        this.magicAttributes.add(magicAttributes);
    }

    public BoxForMagicAttributes(MagicAttributes... magicAttributes) {
        super();
        add(magicAttributes);
    }

    public void add(MagicAttributes... magicAttributes) {
        this.magicAttributes.addAll(Arrays.asList(magicAttributes));
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public String getBoxName() {
        return boxName;
    }

    public void remove(MagicAttributes magicAttributes) {
        this.magicAttributes.remove(magicAttributes);
    }

    public void remove(MagicAttributes... magicAttributes) {
        this.magicAttributes.remove(Arrays.asList(magicAttributes));
    }


    public void clear() {
        magicAttributes.clear();
    }

    @Override
    public void setBallName(String name) {
    }

    @Override
    public void setBallSize(int ballSize) {
    }

    @Override
    public MagicAttributes setDangerous(int dangerous) {
        return null;
    }

    @Override
    public MagicAttributes setPoints(int points) {
        return null;
    }

    @Override
    public int getBallSize() {
        int sumSize = 0;
        for (MagicAttributes attributes : magicAttributes)
            System.out.println(sumSize += attributes.getBallSize());
        return sumSize;
    }

    @Override
    public int getDangerous() {
        int sumDangerouse = 0;
        for (MagicAttributes attributes : magicAttributes)
            System.out.println(sumDangerouse += attributes.getDangerous());
        return sumDangerouse;
    }

    @Override
    public int getPoints() {
        int sumPoints = 0;
        for (MagicAttributes attributes : magicAttributes)
            System.out.println(sumPoints += attributes.getBallSize());
        return sumPoints;
    }

    @Override
    public String getBallName() {
        String allNames = "";
        for (MagicAttributes attributes : magicAttributes) {
            System.out.println(allNames += attributes.getBallName());
            allNames += "\n";
        }
        return allNames;
    }

    public String getBallsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (MagicAttributes attributes : magicAttributes) {
            stringBuilder.append(attributes.getBallSize());
            stringBuilder.append(attributes.getBallSize());
            stringBuilder.append(attributes.getDangerous());
            stringBuilder.append(attributes.getPoints());
        }
        return stringBuilder.toString();
    }

    @Override
    public BoxIterator createBoxIterator() {
        return new BoxIterator();
    }

    public List<MagicAttributes> getMagicAttributes() {
        return magicAttributes;
    }
}