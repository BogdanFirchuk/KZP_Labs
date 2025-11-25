package KI304FirchukLab6;


public class Tool implements Comparable<Tool> {/*Клас Tool описує інструмент.
Він реалізує Comparable<Tool>, щоб інструменти можна було порівнювати (за вагою). */
    private String name;
    private double weight;

    public Tool(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override//Реалізація методу з інтерфейсу Comparable
    public int compareTo(Tool other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return name + " (" + weight + " кг)";
    }
}
