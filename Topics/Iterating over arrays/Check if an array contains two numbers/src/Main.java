import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }
        boolean res = false;
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for (int i = 0; i < size - 1; ++i) {
            if (arr[i] == num1) {
                res = arr[i + 1] == num2 ? true : false;
                if (res) {
                    break;
                }
            } else if (arr[i] == num2) {
                res = arr[i + 1] == num1 ? true : false;
                if (res) {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}