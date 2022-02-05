import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] arrRes = new int[n][m];
        for (int i = 0, j1 = 0; i < n; ++i, ++j1) {
            for (int j = 0, i1 = m - 1; j < m; ++j, --i1) {
                arrRes[i][j] = arr[i1][j1];
            }
        }
        for (int[] i : arrRes) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}