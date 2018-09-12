package Inventory;

public class BatWingMixture implements MagicAttributes {
    private String name;

    public BatWingMixture(){
        name = "Mixture";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOwner() {
        return null;
    }

    @Override
    public void setOwner(String owner) {

    }
}
