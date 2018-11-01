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
    public  static List<MagicAttributes> magicAttributes = new ArrayList<>();

    public void add(MagicAttributes attributes) {
        magicAttributes.add(attributes);
    }

  /*  private Pool(MagicAttributes... magicAttributes) {
       *//* super();*//*
        add(magicAttributes);
    }*/

    public void add(MagicAttributes... attributes) {
        magicAttributes.addAll(Arrays.asList(attributes));
    }

    public void remove(MagicAttributes attributes) {
        magicAttributes.remove(attributes);
    }

    public void remove(MagicAttributes... attributes) {
        magicAttributes.remove(Arrays.asList(attributes));
    }


    public void clear() {
        magicAttributes.clear();
    }




    public  String getBallsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (MagicAttributes attributes : magicAttributes) {
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