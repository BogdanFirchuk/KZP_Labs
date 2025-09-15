import java.util.Scanner;

/**
 * Prints a centered triangle of a given symbol.
 */
public class Main {

    /**
     * Main method.
     * Reads matrix size and symbol from user, builds and prints a triangle.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and symbol
        System.out.print("Enter matrix size (n x n): ");
        int n = sc.nextInt();

        System.out.print("Enter symbol: ");
        char symbol = sc.next().charAt(0);

        // Jagged array: each row can have different length
        char[][] arr = new char[n][];

        // Top half: empty rows
        for (int i = 0; i < n / 2; i++) {
            arr[i] = new char[0];
        }

        // Bottom half: triangle rows
        for (int i = n / 2; i < n; i++) {
            int rowLength = 2 * (i - n / 2) + 1; // 1,3,5...
            arr[i] = new char[rowLength];
            for (int j = 0; j < rowLength; j++) {
                arr[i][j] = symbol;
            }
        }

        // Print the triangle
        for (int i = 0; i < n; i++) {
            int spaces = (n - arr[i].length) / 2;
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            for (int j = 0; j < arr[i].length; j++) System.out.print(arr[i][j]);
            System.out.println();
        }

        sc.close();
    }
}
