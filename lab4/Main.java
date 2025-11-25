package KI304FirchukLab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculation calc = new Calculation();

        System.out.print("Введiть значення x: ");
        double x = scanner.nextDouble();

        try {
            double y = calc.calculate(x);
            System.out.printf("Результат: y = %.3f%n", y);

            try (FileWriter writer = new FileWriter("C:\\Users\\bogda\\OneDrive\\Робочий стіл\\Kzp Lab 4\\Lab4\\result.txt", true)) {
                writer.write("x = " + x + "\n");
                writer.write("y = " + y + "\n");
                System.out.println("Результат записано у файл result.txt");
            }

        } catch (ArithmeticException e) {
            System.out.println("Помилка обчислення: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
