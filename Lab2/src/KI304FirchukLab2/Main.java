package KI304FirchukLab2;

public class Main {
    public static void main(String[] args) {
        AlpinistEquipment firchuk = new AlpinistEquipment("Firchuk");

        AlpinistEquipment climber2 = new AlpinistEquipment("Petrov", 50, 40,4, true, 6);

        firchuk.showAllAttributes();
        climber2.showAllAttributes();

        int maxHeight = climber2.calculateMaxClimbHeight();
        System.out.println("Максимальна висота підйому: " + maxHeight + " м");

        climber2.compareRope(firchuk);

        
    }
}
