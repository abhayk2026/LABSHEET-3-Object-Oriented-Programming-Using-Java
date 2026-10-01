import java.util.Scanner;

public class Q19_Jagged_Array_3_Rows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] jagged = new int[3][];
        System.out.println("Enter length of row 1:");
        jagged[0] = new int[sc.nextInt()];
        System.out.println("Enter length of row 2:");
        jagged[1] = new int[sc.nextInt()];
        System.out.println("Enter length of row 3:");
        jagged[2] = new int[sc.nextInt()];

        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Enter elements of row " + (i + 1) + ":");
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array:");
        for (int[] row : jagged) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
