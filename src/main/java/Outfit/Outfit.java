package Outfit;

import Outfit.broom.Broom;
import Outfit.cloak.Cloak;

public class Outfit {
    Broom broom;
    Cloak cloak;

    public Outfit(Broom broom, Cloak cloak){
        this.broom = broom;
        this.cloak = cloak;
    }

    public void setBroom(Broom broom) {
        this.broom = broom;
    }

    public void setCloak(Cloak cloak) {
        this.cloak = cloak;
    }

}