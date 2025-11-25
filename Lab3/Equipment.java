package KI304FirchukLab3;


public abstract class Equipment {
    protected String ownerName;
    protected int totalWeight;
    protected int numberOfItems;

    
    public Equipment(String ownerName, int totalWeight, int numberOfItems) {
        this.ownerName = ownerName;
        this.totalWeight = totalWeight;
        this.numberOfItems = numberOfItems;
    }

    
    public String getOwnerName() {
        return ownerName;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public abstract void showAllAttributes();
}
