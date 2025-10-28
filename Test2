import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the size of the matrix
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        // Enter a placeholder character
        System.out.print("Enter symbol: ");
        char symbol = sc.next().charAt(0);

        // creating a jagged array 
        char[][] arr = new char[n][];

        // Initialize the top half as empty strings
        for (int i = 0; i < n / 2; i++) {
            arr[i] = new char[0];
        }

        // Initialize the bottom part as jagged arrays
        for (int i = n / 2; i < n; i++) {
            int rowLength = 2 * (i - n / 2) + 1;
            arr[i] = new char[rowLength];
            for (int j = 0; j < rowLength; j++) {
                arr[i][j] = symbol;
            }
        }

        // Outpu
        for (int i = 0; i < n; i++) {
            int spaces = (n - arr[i].length) / 2;

            //Indents before a lines
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            //Output of the entire matrix
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
