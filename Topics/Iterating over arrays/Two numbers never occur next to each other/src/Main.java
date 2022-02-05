import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = scanner.nextInt();
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean res = true;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i - 1] == num1 && arr[i] == num2) {
                res = false;
                break;
            }
            if (arr[i - 1] == num2 && arr[i] == num1) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}