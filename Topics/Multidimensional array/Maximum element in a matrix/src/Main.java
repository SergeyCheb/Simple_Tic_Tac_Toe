import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i1 = 0; i1 < m; ++i1) {
            for (int j1 = 0; j1 < n; ++j1) {
                arr[i1][j1] = scanner.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        int max = arr[i][j];
        for (int i1 = 0; i1 < m; ++i1) {
            for (int j1 = 0; j1 < n; ++j1) {
                if (arr[i1][j1] > max) {
                    max = arr[i1][j1];
                    i = i1;
                    j = j1;
                }
            }
        }
        System.out.println(i + " " + j);
    }
}