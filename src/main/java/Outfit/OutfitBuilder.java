package Outfit;

import Outfit.broom.Broom;
import Outfit.broom.SimpleBroom;
import Outfit.cloak.Cloak;
import Outfit.cloak.SimpleCloak;

public class OutfitBuilder implements CreateOutfit {
    Broom broom;
    Cloak cloak;


    @Override
    public void createBroom(Broom broom) {
        broom.hasExtraSpeed();
        this.broom = broom;
    }

    @Override
    public void createCloak(Cloak cloak) {
        cloak.hasProtected();
        this.cloak = cloak;
    }

    public Outfit getResult(){
        return new Outfit(broom, cloak);
    }

}