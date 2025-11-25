package KI304FirchukLab3;


public class Main {
    public static void main(String[] args) {

        AlpinistEquipment firchuk = new AlpinistEquipment("Firchuk");
        AlpinistEquipment petrov = new AlpinistEquipment("Petrov", 54, 30, 3, true, 8);


        firchuk.showAllAttributes();
        petrov.showAllAttributes();


        int maxHeight = petrov.calculateMaxClimbHeight();
        System.out.println("Максимальна висота пiдйому Petrov: " + maxHeight + " м");

    
        petrov.compareRope(firchuk);

    
        double avgWeight = petrov.calculateAverageWeight();
        System.out.println("Середня вага предмета спорядження Petrov: " + avgWeight + " кг");
    }
}
