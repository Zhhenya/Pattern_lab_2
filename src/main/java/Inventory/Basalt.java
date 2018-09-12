package Inventory;

public class Basalt implements MagicAttributes {
    private String name;
    private String owner;

    public Basalt(){
        name = "Basalt";
    }

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
