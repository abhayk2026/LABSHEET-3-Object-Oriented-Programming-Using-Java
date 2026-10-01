import java.util.Scanner;

public class Q16_Count_Positive_Negative_3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers: ");
        int layers = sc.nextInt();
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    int value = sc.nextInt();
                    if (value > 0) {
                        positive++;
                    } else if (value < 0) {
                        negative++;
                    } else {
                        zero++;
                    }
                }
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zero values = " + zero);
        sc.close();
    }
}
