import java.util.Scanner;

public class Q24_Remove_Duplicates_No_Collections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] unique = new int[n];
        int uniqueCount = 0;

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean exists = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (a[i] == unique[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                unique[uniqueCount] = a[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
