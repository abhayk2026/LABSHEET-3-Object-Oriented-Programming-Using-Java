import java.util.Scanner;

public class Q15_Sum_3D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers: ");
        int layers = sc.nextInt();
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][][] a = new int[layers][rows][cols];
        long sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    a[i][j][k] = sc.nextInt();
                    sum += a[i][j][k];
                }
            }
        }

        System.out.println("Sum of all elements = " + sum);
        sc.close();
    }
}
