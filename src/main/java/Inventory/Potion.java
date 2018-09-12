package Inventory;

import java.util.ArrayList;
import java.util.List;

public class Potion implements MagicAttributes {
    private String owner;
    private List<MagicAttributes> components;

    //композиция

    public Potion(){
        components = new ArrayList<MagicAttributes>();
    }

    public void add(MagicAttributes component){
        components.add(component);
    }

    public void remove(MagicAttributes component){
        int index = components.indexOf(component);
        components.remove(index);
    }

    public void getComponentName(MagicAttributes component){
        int index = components.indexOf(component);
        components.get(index).getName();
    }

    public void getComponentOwner(MagicAttributes component){
        int index = components.indexOf(component);
        components.get(index).getOwner();
    }

    public List<MagicAttributes> getComponents() {
        return components;
    }

    public int getPotionSize(){
        return components.size();
    }

    @Override
    public String getName() {
        for(MagicAttributes component : components){
            System.out.println(component.getName());
        }
        return "";
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
