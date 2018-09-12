package Inventory.Decorator;

import Inventory.MagicAttributes;

public class MagicAttributesDecorator implements MagicAttributes {
    private MagicAttributes magicAttributes;
    private String name;

    public MagicAttributesDecorator(MagicAttributes magicAttributes, String name){
        this.magicAttributes = magicAttributes;
        this.name = name;
    }

    @Override
    public String getName() {
        return "Created new magic attribute " + name +  " with " + magicAttributes.getName();
    }

    @Override
    public String getOwner() {
        return "OwnerMAtr";
    }

    @Override
    public void setOwner(String owner) {

    }
}
