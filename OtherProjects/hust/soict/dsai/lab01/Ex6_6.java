import java.util.Scanner;

public class Ex6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Columns: ");
        int cols = scanner.nextInt();

        int[][] mtr1 = new int[rows][cols];
        int[][] mtr2 = new int[rows][cols];
        int[][] sumMtr = new int[rows][cols];

        System.out.println("First Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mtr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Second Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mtr2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMtr[i][j] = mtr1[i][j] + mtr2[i][j];
            }
        }

        System.out.println("Sum: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMtr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}