package Outfit;

import Outfit.broom.SimpleBroom;
import Outfit.cloak.SimpleCloak;

import javax.swing.text.html.ImageView;

public class SimpleOutfit implements CreateOutfit {

    SimpleBroom simpleBroom;
    SimpleCloak simpleCloak;


    public SimpleBroom getBroom() {
        return simpleBroom;
    }

    public SimpleCloak getCloak() {
        return simpleCloak;
    }


    @Override
    public void createBroom() {
        simpleBroom = new SimpleBroom();
        simpleBroom.hasExtraSpeed();
    }

    @Override
    public void createCloak() {
        simpleCloak = new SimpleCloak();
        simpleCloak.hasProtected();
    }
}