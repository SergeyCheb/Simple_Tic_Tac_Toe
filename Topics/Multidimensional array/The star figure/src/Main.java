import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = ".";
            }
        }
        for (int i = 0; i < n; ++i) {
            arr[n / 2][i] = "*";
            arr[i][n / 2] = "*";
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j || j == n - i - 1) {
                    arr[i][j] = "*";
                }
            }
        }
        for (String[] i : arr) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}