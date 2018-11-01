package Outfit;

import Outfit.broom.AdvancedBroom;
import Outfit.broom.SimpleBroom;
import Outfit.cloak.AdvancedCloak;
import Outfit.cloak.SimpleCloak;

public class GetterOutfit {

    public void createSimpleBroomSimpleCloak(OutfitBuilder builder){
        builder.createBroom(new SimpleBroom());
        builder.createCloak(new SimpleCloak());
    }

    public void createSpeedBroomSimpleCloak(OutfitBuilder builder){
        builder.createBroom(new AdvancedBroom());
        builder.createCloak(new SimpleCloak());
    }

    public void createSpeedBroomProtectedCloak(OutfitBuilder builder){
        builder.createBroom(new AdvancedBroom());
        builder.createCloak(new AdvancedCloak());
    }

    public void createSimpleBroomProtectedCloak(OutfitBuilder builder){
        builder.createBroom(new SimpleBroom());
        builder.createCloak(new AdvancedCloak());
    }

}