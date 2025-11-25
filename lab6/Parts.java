package KI304FirchukLab6;

public class Parts implements Comparable<Parts> {
    private String type;
    private double price;

    public Parts(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public int compareTo(Parts other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return type + " (" + price + " грн)";
    }
}
