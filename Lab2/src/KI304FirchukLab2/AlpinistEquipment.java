package KI304FirchukLab2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AlpinistEquipment {
    private String ownerName;
    private int backpackCapacity;
    private int ropeLength;
    private double totalWeight;
    private boolean hasHelmet;
    private int itemCount;

    public AlpinistEquipment() {
        
        this.ownerName = "Unknown";
        this.backpackCapacity = 50;
        this.ropeLength = 50;
        this.totalWeight = 5.0;
        this.hasHelmet = true;
        this.itemCount = 3;
    }


    public AlpinistEquipment(String ownerName) {
        this();
        this.ownerName = ownerName;
    }


    public AlpinistEquipment(String ownerName, int backpackCapacity, int ropeLength, double totalWeight, boolean hasHelmet, int itemCount) {
        
        this.ownerName = ownerName;
        this.backpackCapacity = backpackCapacity;
        this.ropeLength = ropeLength;
        this.totalWeight = totalWeight;
        this.hasHelmet = hasHelmet;
        this.itemCount = itemCount;
    }

    // Логування
    private void logAction(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            writer.println(dtf.format(now) + " - " + message);
        } catch (IOException e) {
            System.err.println("Помилка запису в лог: " + e.getMessage());
        }
    }

    // Метод показати всі атрибути
    public void showAllAttributes() {
        logAction("Викликано showAllAttributes() для " + ownerName);
        System.out.println("Ім'я альпініста: " + ownerName);
        System.out.println("Місткість рюкзака: " + backpackCapacity + " л");
        System.out.println("Довжина мотузки: " + ropeLength + " м");
        System.out.println("Загальна вага спорядження: " + totalWeight + " кг");
        System.out.println("Наявність каски: " + hasHelmet);
        System.out.println("Кількість предметів спорядження: " + itemCount);
        System.out.println();
    }

    // Метод для розрахунку максимальної висоти підйому
    public int calculateMaxClimbHeight() {
        int baseHeight = 1000;
        int bonus = itemCount * 50;
        int height = baseHeight + bonus;
        logAction("Розрахована висота підйому: " + height + " м для " + ownerName);
        return height;
    }

    // Метод для порівняння довжини мотузки з іншим спорядженням
    public void compareRope(AlpinistEquipment other) {
        logAction("Порівняння довжини мотузки між " + ownerName + " і " + other.ownerName);
        if (this.ropeLength > other.ropeLength) {
            System.out.println(ownerName + " має довшу мотузку.");
        } else if (this.ropeLength < other.ropeLength) {
            System.out.println(other.ownerName + " має довшу мотузку.");
        } else {
            System.out.println("У обох однакова довжина мотузки.");
        }
    }

    // Очистити лог-файл
    public void clearLogFile() {
        try {
            FileWriter writer = new FileWriter("KI304FirchukLab2/log.txt", false);
            writer.close();
            System.out.println("Лог-файл очищено.");
        } catch (IOException e) {
            System.err.println("Помилка очищення логу: " + e.getMessage());
        }
    }
}
