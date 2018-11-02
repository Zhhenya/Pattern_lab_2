package poolBox;

import Box.BoxIterator;
import MagicAtributes.BallProperties;
import MagicAtributes.MagicAttributes;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Pool {
    private static Pool pool;
    public  List<MagicAttributes> magicAttributesFree = new ArrayList<>();
    public  List<MagicAttributes> magicAttributesUsed = new ArrayList<>();


    public  void add(MagicAttributes attributes) {
        magicAttributesFree.add(attributes);
    }

    public void add(MagicAttributes... attributes) {
        magicAttributesFree.addAll(Arrays.asList(attributes));
    }

    public  void remove(MagicAttributes attributes) {
        magicAttributesFree.remove(attributes);
    }

    public  void remove(MagicAttributes... attributes) {
        magicAttributesFree.remove(Arrays.asList(attributes));
    }

    public void addInUsed(MagicAttributes attributes) {
        magicAttributesUsed.add(attributes);
    }

    public void addInUsed(MagicAttributes... attributes) {
        magicAttributesUsed.addAll(Arrays.asList(attributes));
    }

    public void removeInUsed(MagicAttributes attributes) {
        magicAttributesUsed.remove(attributes);
    }

    public void removeInUsed(MagicAttributes... attributes) {
        magicAttributesUsed.remove(Arrays.asList(attributes));
    }


    public void clear() {
        magicAttributesFree.clear();
    }




    public  String getBallsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (MagicAttributes attributes : magicAttributesFree) {
            stringBuilder.append(attributes.getBallSize());
            stringBuilder.append(attributes.getBallSize());
            stringBuilder.append(attributes.getDangerous());
            stringBuilder.append(attributes.getPoints());
        }
        return stringBuilder.toString();
    }

    public static Pool getPool() {
        if(pool == null)
            pool = new Pool();
        return pool;
    }
}