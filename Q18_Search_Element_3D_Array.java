import java.util.Scanner;

public class Q18_Search_Element_3D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers: ");
        int layers = sc.nextInt();
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][][] a = new int[layers][rows][cols];

        System.out.println("Enter elements:");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    if (a[i][j][k] == target) {
                        System.out.println("Element found at layer " + (i + 1)
                                + ", row " + (j + 1) + ", column " + (k + 1));
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}
