package KI304FirchukLab3;


public class AlpinistEquipment extends Equipment implements WeightCalculable {

    private int ropeLength;
    private boolean hasHelmet;
    private int climbExperience;

    
    public AlpinistEquipment(String ownerName, int totalWeight, int numberOfItems, int ropeLength, boolean hasHelmet, int climbExperience) {
        super(ownerName, totalWeight, numberOfItems);
        this.ropeLength = ropeLength;
        this.hasHelmet = hasHelmet;
        this.climbExperience = climbExperience;
    }

    
    public AlpinistEquipment(String ownerName) {
        super(ownerName, 0, 0);
        this.ropeLength = 0;
        this.hasHelmet = false;
        this.climbExperience = 0;
    }


    @Override
    public void showAllAttributes() {
        System.out.println("=== Iнформацiя про альпiнiста " + ownerName + " ===");
        System.out.println("Загальна вага спорядження: " + totalWeight + " кг");
        System.out.println("Кiлькiсть предметiв: " + numberOfItems);
        System.out.println("Довжина мотузки: " + ropeLength + " м");
        System.out.println("Наявнiсть шолома: " + (hasHelmet ? "так" : "нi"));
        System.out.println("Досвiд сходжень: " + climbExperience + " рокiв");
        System.out.println("----------------------------------------------");
    }

    
    public int calculateMaxClimbHeight() {
        return (ropeLength * 10) + (climbExperience * 50);
    }

    
    public void compareRope(AlpinistEquipment other) {
        if (this.ropeLength > other.ropeLength) {
            System.out.println(ownerName + " має довшу мотузку, нiж " + other.ownerName);
        } else if (this.ropeLength < other.ropeLength) {
            System.out.println(ownerName + " має коротшу мотузку, нiж " + other.ownerName);
        } else {
            System.out.println(ownerName + " i " + other.ownerName + " мають однакову довжину мотузки");
        }
    }


    @Override
    public double calculateAverageWeight() {
        if (numberOfItems == 0) return 0;
        return (double) totalWeight / numberOfItems;
    }
}
