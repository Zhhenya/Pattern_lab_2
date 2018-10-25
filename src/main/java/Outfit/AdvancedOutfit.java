package Outfit;

import Outfit.broom.AdvancedBroom;
import Outfit.cloak.AdvancedCloak;
import Outfit.cloak.Cloak;

public class AdvancedOutfit implements CreateOutfit{

    AdvancedBroom advancedBroom;

    public AdvancedBroom getBroom() {
        return advancedBroom;
    }

    public AdvancedCloak getCloak() {
        return advancedCloak;
    }

    AdvancedCloak advancedCloak;


    @Override
    public void createBroom() {
        advancedBroom = new AdvancedBroom();
        advancedBroom.hasExtraSpeed();
    }

    @Override
    public void createCloak() {
        advancedCloak = new AdvancedCloak();
        advancedCloak.hasProtected();
    }
}