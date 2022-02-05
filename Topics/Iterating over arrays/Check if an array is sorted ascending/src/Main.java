import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }
        boolean res = true;
        for (int i = 0; i < size - 1; ++i) {
            res = arr[i] > arr[i + 1] ? false : true;
            if (!res) {
                break;
            }
        }
        System.out.println(res);
    }
}