import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; ++i) {
            a[i] = scanner.nextInt();
        }
        int[] a1 = new int[size];
        for (int i = 0; i < size; ++i) {
            if (i == 0) {
                a1[i] = a[size - 1];
            } else {
                a1[i] = a[i - 1];
            }
        }
        for (int i = 0; i < size; ++i) {
            a[i] = a1[i];
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}