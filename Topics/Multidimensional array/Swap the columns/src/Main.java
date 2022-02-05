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
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int[] temp = new int[m];
        for (int x = 0; x < m; ++x) {
            temp[x] = arr[x][i];
            arr[x][i] = arr[x][j];
            arr[x][j] = temp[x];
        }
        for (int x = 0; x < m; ++x) {
            for (int y = 0; y < n; ++y) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}