package Inventory.Decorator;

import Inventory.Decorator.MagicAttributesDecorator;

public class SuperMagic extends MagicAttributesDecorator {
    public SuperMagic(MagicAttributesDecorator magicAttributesDecorator){
        super(magicAttributesDecorator, "Amusing potion");
    }


    public void getNewMagicAttribute(){
        System.out.println("Created new magic attribute with " + getName());
    }

}
