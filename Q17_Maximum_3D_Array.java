import java.util.Scanner;

public class Q17_Maximum_3D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers: ");
        int layers = sc.nextInt();
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        if (layers <= 0 || rows <= 0 || cols <= 0) {
            System.out.println("All dimensions must be positive.");
            sc.close();
            return;
        }

        int max = Integer.MIN_VALUE;

        System.out.println("Enter elements:");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    int value = sc.nextInt();
                    if (value > max) {
                        max = value;
                    }
                }
            }
        }

        System.out.println("Maximum element = " + max);
        sc.close();
    }
}
