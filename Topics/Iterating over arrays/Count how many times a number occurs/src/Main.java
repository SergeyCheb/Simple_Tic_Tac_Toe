import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int occ = 0;
        for (int i : arr) {
            if (i == n) {
                ++occ;
            }
        }
        System.out.println(occ);
    }
}