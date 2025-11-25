import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Введення розміру матриці та символу
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        System.out.print("Enter symbol: ");
        char symbol = sc.next().charAt(0);

        char[][] arr = new char[n][];

        // Верхня частина
        for (int i = 0; i < n / 2; i++) {
            arr[i] = new char[0];
        }

        // Нижня частина
        for (int i = n / 2; i < n; i++) {
            int rowLength = 2 * (i - n / 2) + 1;
            arr[i] = new char[rowLength];
            for (int j = 0; j < rowLength; j++) {
                arr[i][j] = symbol;
            }
          
            if (rowLength > 0) {
                arr[i][0] = '?';
            }
        }

        // Шлях до файлу
        String path = "C:\\KZp_Java\\Git_labs\\triangle.txt";

        // Переконаємося, що директорія існує
        File dir = new File("C:\\KZp_Java\\Git_labs");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // Вивід у файл і консоль
        try (FileWriter writer = new FileWriter(path)) {
            for (int i = 0; i < n; i++) {
                int spaces = (n - arr[i].length) / 2;

                // Пробіли перед рядком
                for (int s = 0; s < spaces; s++) {
                    System.out.print(" ");
                    writer.write(" ");
                }

                // Вивід символів
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                    writer.write(arr[i][j]);
                }

                System.out.println();
                writer.write(System.lineSeparator());
            }
            System.out.println("\nФайл 'triangle.txt' успішно створений у C:\\KZp_Java\\Git_labs");
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
        }

        sc.close();
    }
}
