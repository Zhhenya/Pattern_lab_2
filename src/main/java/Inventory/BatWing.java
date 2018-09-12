package Inventory;

public class BatWing implements MagicAttributes {
    private String name;
    private String owner;

    public BatWing(){
        name = "BatWing";
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
