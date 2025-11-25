package KI304FirchukLab5;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation calc = new Calculation();
        ResultFileManager manager = new ResultFileManager();

        System.out.print("Введiть значення x: ");
        double x = sc.nextDouble();

        try {
            double y = calc.calculate(x);
            System.out.println("Обчислено: y = " + y);

            manager.writeText("result.txt", x, y);
            manager.writeBinary("result.bin", x, y);

            System.out.println("\nЧитання");
            manager.readText("result.txt");
            manager.readBinary("result.bin");

        } catch (ArithmeticException e) {
            System.out.println("Помилка обчислення:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Помилка файлу:" + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
