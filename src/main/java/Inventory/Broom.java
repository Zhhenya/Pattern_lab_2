package Inventory;

public class Broom implements MagicAttributes{
    private String name;
    private String owner;

    @Override
    public String getName() {
        return name;
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
