package KI304FirchukLab6;

public class Main {
    public static void main(String[] args) {
        ToolBox<Tool> toolBox = new ToolBox<>();
        toolBox.addItem(new Tool("Молоток", 1.0));
        toolBox.addItem(new Tool("Викрутка", 0.4));
        toolBox.addItem(new Tool("Пилка", 1.0));
        toolBox.addItem(new Tool("Молоток", 1.2));

        System.out.println("Iнструменти в коробцi:");
        toolBox.printAll();
        System.out.println("Найлегший iнструмент: " + toolBox.findMin());

        ToolBox<Parts> partBox = new ToolBox<>();
        partBox.addItem(new Parts("Гайка", 5.0));
        partBox.addItem(new Parts("Шайба", 2.0));
        partBox.addItem(new Parts("Шурупи", 2.5));

        System.out.println("\nЗапасни частини в коробцi:");
        partBox.printAll();
        System.out.println("Найдешевша деталь: " + partBox.findMin());

        System.out.println("кiлькiсть iнструментiв: " + toolBox.getAddedCount());
        System.out.println("кiлькiсть запчастин: " + partBox.getAddedCount());
    }
}