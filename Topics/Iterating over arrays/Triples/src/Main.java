import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }
        int triple = 0;
        for (int i = 0; i < size - 2; ++i) {
            if (arr[i + 1] - arr[i] == 1 && arr[i + 2] - arr[i + 1] == 1) {
                ++triple;
            }
        }
        System.out.println(triple);
    }
}