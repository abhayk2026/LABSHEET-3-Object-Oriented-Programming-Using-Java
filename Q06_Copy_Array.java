import java.util.Scanner;

public class Q06_Copy_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] source = new int[n];
        int[] destination = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            source[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            destination[i] = source[i];
        }

        System.out.println("Copied array:");
        for (int value : destination) {
            System.out.print(value + " ");
        }
        System.out.println();
        sc.close();
    }
}
