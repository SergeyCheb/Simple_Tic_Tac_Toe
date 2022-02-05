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
        int k = scanner.nextInt();
        int i = 0;
        boolean res = false;
        for (; i < m; ++i) {
            int avlb = 1;
            for (int j = 0; j < n - 1; ++j) {
                if (arr[i][j] == 0 && arr[i][j + 1] == 0) {
                    ++avlb;
                } else {
                    avlb = 1;
                }
                if (avlb == k) {
                    res = true;
                    break;
                }
            }
            if (res) {
                break;
            }
        }
        if (res) {
            System.out.println(i + 1);
        } else {
            System.out.println(0);
        }
    }
}