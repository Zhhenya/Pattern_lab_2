package Inventory;

public class AdapterBatWing extends BatWingMixture {
    public String getMixture(BatWing batWing){
        return batWing.getName() + " it is a mixture";
    }
}
