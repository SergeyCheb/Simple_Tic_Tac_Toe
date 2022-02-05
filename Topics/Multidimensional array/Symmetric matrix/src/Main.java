import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }
        boolean res = true;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i != j) {
                    res = arr[i][j] == arr[j][i];
                    if (!res) {
                        break;
                    }
                }
            }
            if (!res) {
                break;
            }
        }
        if (res) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}