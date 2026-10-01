import java.util.Scanner;

public class Q25_Diagonal_Sums_Square_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        long mainDiagonal = 0;
        long secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum = " + mainDiagonal);
        System.out.println("Secondary diagonal sum = " + secondaryDiagonal);
        sc.close();
    }
}
