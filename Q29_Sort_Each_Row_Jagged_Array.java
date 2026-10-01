import java.util.Arrays;
import java.util.Scanner;

public class Q29_Sort_Each_Row_Jagged_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] jagged = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int length = sc.nextInt();
            jagged[i] = new int[length];

            System.out.println("Enter elements of row " + (i + 1) + ":");
            for (int j = 0; j < length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        for (int[] row : jagged) {
            Arrays.sort(row);
        }

        System.out.println("Jagged array after sorting each row:");
        for (int[] row : jagged) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
